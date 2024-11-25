package pe.edu.i202223044.cl1_jpa_data_luna_diego.config;
import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import javax.sql.DataSource;
@Configuration
public class ConexionesConfig {

    @Value("${DB_WORLD_URL")
    private String bdWorldUrl;
    @Value("${DB_WORLD_USER")
    private String bdWorldUser;
    @Value("${DB_WORLD_PASS")
    private String bdWorldPass;
    @Value("${DB_WORLD_DRIVER")
    private String bdWorldDriver;
    @Bean
    public DataSource dataSource() {
        HikariConfig hikariConfig = new HikariConfig();
        hikariConfig.setJdbcUrl(bdWorldUrl);
        hikariConfig.setUsername(bdWorldUser);
        hikariConfig.setPassword(bdWorldPass);
        hikariConfig.setDriverClassName(bdWorldDriver);

        hikariConfig.setMaximumPoolSize(30);
        hikariConfig.setMinimumIdle(4);
        hikariConfig.setIdleTimeout(240000);
        hikariConfig.setConnectionTimeout(45000);
        return new HikariDataSource(hikariConfig);
    }
}
