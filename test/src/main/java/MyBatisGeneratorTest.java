import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.exception.InvalidConfigurationException;
import org.mybatis.generator.exception.XMLParserException;
import org.mybatis.generator.internal.DefaultShellCallback;

/**
 * @Description: Mybatis逆向工程测试类
 */
public class MyBatisGeneratorTest {

    public static void main(String[] args) throws IOException, XMLParserException, InvalidConfigurationException, SQLException, InterruptedException {

        //  找到配置文件
        File file = new File("src/main/resources/generator.xml");
        //  需要生成List保存警告信息
        List<String> warnings = new ArrayList<String>();
        ConfigurationParser cp = new ConfigurationParser(warnings);
        Configuration config = cp.parseConfiguration(file);
        DefaultShellCallback callBack = new DefaultShellCallback(true);
        //  逆向工程核心类
        MyBatisGenerator generator = new MyBatisGenerator(config, callBack, warnings);
        generator.generate(null);
    }
}