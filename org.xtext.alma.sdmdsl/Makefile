TABLES_DIR = tables
ENUMERATIONS_DIR = enumerations
TABLES =  $(wildcard $(TABLES_DIR)/*.table)




clean : 
	@rm -rf generated/*

build : 
	ant -buildfile ant-build.xml

build-generate-xtext-artifacts : 
	ant -buildfile ant-build.xml generate-xtext-artifacts

build-compile-xtend : 
	ant -buildfile ant-build.xml compile-xtend

build-compile-java : 
	ant -buildfile ant-build.xml compile-java

build-clean : 
	ant -buildfile ant-build.xml clean



all :
	@java -classpath ./lib/*:./ant/bin/:../org.xtext.alma.enumeration/ant/bin:../org.xtext.alma.container/bin/ org.xtext.alma.sdmdsl.generator.Main --enum-dir  $(ENUMERATIONS_DIR) --table-dir  $(TABLES_DIR) 

test : 
	@echo $(TABLES)