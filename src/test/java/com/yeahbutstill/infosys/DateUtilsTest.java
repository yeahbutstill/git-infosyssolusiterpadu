package com.yeahbutstill.infosys;

import com.yeahbutstill.infosys.util.DateUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

public class DateUtilsTest {

    Date date;
    String resultFormat;

    @BeforeEach
    public void init() {

        date = Date.from(LocalDate.of(2022, 1, 22).atStartOfDay(ZoneId.systemDefault()).toInstant());
        resultFormat = new DateUtils().dateTimeToFormat(date, "yyyyMMMdd");

    }

    @Test
    public void dateTimeFormatShouldSuccess() {

        Assertions.assertEquals("2022jan22", resultFormat);

    }

    @Test
    public void dateTimeFormatShouldNotSuccess() {

        Assertions.assertNotEquals("2022jan21", resultFormat);

    }

}
