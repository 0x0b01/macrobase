package macrobase.ingest;

import macrobase.conf.ConfigurationException;
import macrobase.conf.MacroBaseConf;

import java.sql.SQLException;

public class ClickHouseIngester extends SQLIngester {
    public ClickHouseIngester(MacroBaseConf conf) throws ConfigurationException, SQLException {
        super(conf);
    }

    @Override
    public String getDriverClass() {
        return "com.clickhouse.jdbc.ClickHouseDriver";
    }

    @Override
    public String getJDBCUrlPrefix() {
        return "jdbc:clickhouse:";
    }
}
