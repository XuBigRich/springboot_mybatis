package top.piao888.springboot.handle;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;
import org.springframework.stereotype.Component;

import java.sql.*;
import java.time.LocalDateTime;
import java.util.List;

/**
 * Timestamp转换LocalDateTime
 */
@Component
public class ListToStringHandler extends BaseTypeHandler<Timestamp> {

    @Override
    public void setNonNullParameter(PreparedStatement preparedStatement, int i, Timestamp list, JdbcType jdbcType) throws SQLException {
        preparedStatement.setString(i, list.toLocalDateTime().toString());
    }

    @Override
    public Timestamp getNullableResult(ResultSet resultSet, String s) throws SQLException {
        Timestamp timestamp = Timestamp.valueOf(resultSet.getString(s));
        return timestamp;
    }

    @Override
    public Timestamp getNullableResult(ResultSet resultSet, int i) throws SQLException {
        Timestamp timestamp = Timestamp.valueOf(resultSet.getString(i));
        return timestamp;
    }

    @Override
    public Timestamp getNullableResult(CallableStatement callableStatement, int i) throws SQLException {
        Timestamp timestamp = Timestamp.valueOf(callableStatement.getString(i));
        return timestamp;
    }
}
