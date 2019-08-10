package com.sidneysimmons.simple.boot.serializer;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import java.io.IOException;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Serializer for standard {@link ZonedDateTime} objects. This serializer will make sure the
 * date/time is in UTC and then format via ISO format.
 * 
 * @author Sidney Simmons
 */
public class ZonedDateTimeSerializer extends JsonSerializer<ZonedDateTime> {

	private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ISO_OFFSET_DATE_TIME;

	@Override
	public void serialize(ZonedDateTime value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
		// Convert the given date time to UTC and then format it
		ZonedDateTime utcValue = value.withZoneSameInstant(ZoneId.of("UTC"));
		gen.writeString(FORMATTER.format(utcValue));
	}

}
