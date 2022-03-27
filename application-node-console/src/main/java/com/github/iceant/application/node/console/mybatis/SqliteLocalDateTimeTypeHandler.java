package com.github.iceant.application.node.console.mybatis;

import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.MappedJdbcTypes;
import org.apache.ibatis.type.MappedTypes;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

@MappedJdbcTypes(JdbcType.VARCHAR)
@MappedTypes(LocalDateTime.class)
public class SqliteLocalDateTimeTypeHandler extends BaseTypeHandler<LocalDateTime> {
    static final String PATTERN = "yyyy-MM-dd HH:mm:ss.SSS";
    static final String PATTERN_SIMPLE = "yyyy-MM-dd HH:mm:ss";
    @Override
    public void setNonNullParameter(PreparedStatement ps, int i, LocalDateTime parameter, JdbcType jdbcType) throws SQLException {
        String value = parameter.format(DateTimeFormatter.ofPattern(PATTERN));
        ps.setString(i, value);
    }

    @Override
    public LocalDateTime getNullableResult(ResultSet rs, String columnName) throws SQLException {
        String value = rs.getString(columnName);
        try {
            return LocalDateTime.parse(value, DateTimeFormatter.ofPattern(PATTERN));
        }catch (DateTimeParseException e){
            return LocalDateTime.parse(value, DateTimeFormatter.ofPattern(PATTERN_SIMPLE));
        }
    }

    @Override
    public LocalDateTime getNullableResult(ResultSet rs, int columnIndex) throws SQLException {
        return LocalDateTime.parse(rs.getString(columnIndex), DateTimeFormatter.ofPattern(PATTERN));
    }

    @Override
    public LocalDateTime getNullableResult(CallableStatement cs, int columnIndex) throws SQLException {
        return LocalDateTime.parse(cs.getString(columnIndex), DateTimeFormatter.ofPattern(PATTERN));
    }
}
