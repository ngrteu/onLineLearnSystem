package com.learn.System;

import java.util.ArrayList;
import java.util.Scanner;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.core.exceptions.MybatisPlusException;
import com.baomidou.mybatisplus.core.toolkit.StringUtils;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.po.TableFill;
import com.baomidou.mybatisplus.generator.config.rules.DateType;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;

public class CodeAutoGeneratorStyle{
	//数据库连接字符串
	static String mysqlLocalHost = "jdbc:mysql:///onlinelearningsystem?useUnicode=true&useSSL=false&characterEncoding=utf8";
	//加载驱动
	static String mysqlDriverName = "com.mysql.cj.jdbc.Driver";
	//数据库账号
	static String mysqlRootID =	"root";
	//数据库密码
	static String mysqlPassword = "220225";
	//Java要保存的位置包名
	static String javaPackageName = "com.learn.System";
	
	public static String scanner(String tip) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder help = new StringBuilder();
        help.append("请输入" + tip + "：");
        System.out.println(help.toString());
        if (scanner.hasNext()) {
            String ipt = scanner.next();
            if (StringUtils.isNotBlank(ipt)) {
                return ipt;
            }
        }
        throw new MybatisPlusException("请输入正确的" + tip + "！");
    }

    public static void main(String[] args) {
        // 代码生成器
        AutoGenerator mpg = new AutoGenerator();

        // 全局配置
        GlobalConfig gc = new GlobalConfig();
        String projectPath = System.getProperty("user.dir");
        gc.setOutputDir(projectPath + "/src/main/java");
        gc.setAuthor("whc");
        gc.setOpen(false);//是否打开文件夹
        gc.setServiceName("%sService");//去掉默认生成的IUserServiceq去掉I
        gc.setIdType(IdType.ID_WORKER_STR);//分布式主键生成策略
        gc.setDateType(DateType.ONLY_DATE);//使用util.Date来对应数据库的日期类型
        //gc.setSwagger2(true);//实体自动加Swagger2 注解,给类或者字段加swagger测试调用时的注释,数据库中有有注释(comment),这里就会自动生成
        mpg.setGlobalConfig(gc);

        // 数据源配置
        DataSourceConfig dsc = new DataSourceConfig();
        dsc.setUrl(mysqlLocalHost);
        // dsc.setSchemaName("public");
        dsc.setDriverName(mysqlDriverName);
        dsc.setUsername(mysqlRootID);
        dsc.setPassword(mysqlPassword);
        mpg.setDataSource(dsc);

        // 包配置
        PackageConfig pc = new PackageConfig();
        pc.setModuleName(scanner("crud"));
        pc.setParent(javaPackageName);
        mpg.setPackageInfo(pc);

        // 如果模板引擎是 velocity
        String templatePath = "/templates/mapper.xml.vm";
        
        //策略配置
        StrategyConfig strategy = new StrategyConfig();
        //数据库名映射规范 如:create_Time  java:createTime
        strategy.setColumnNaming(NamingStrategy.underline_to_camel);
        //entity生成使用lombok方式
        strategy.setEntityLombokModel(true);
        //帮我们给逻辑删除字段添加注解  填写数据库字段名
        strategy.setLogicDeleteFieldName("is_deleted");
        //自动填充    填写数据库字段名
        TableFill create = new TableFill("create_time",FieldFill.INSERT);
        TableFill update = new TableFill("update_time",FieldFill.INSERT_UPDATE);
        ArrayList<TableFill> list = new ArrayList<TableFill>();
        list.add(create);
        list.add(update);
        strategy.setTableFillList(list);
        //乐观锁
        strategy.setVersionFieldName("version");//version字段自动加注解
        
        mpg.setStrategy(strategy);
        
        //走起
        mpg.execute();
    }
}