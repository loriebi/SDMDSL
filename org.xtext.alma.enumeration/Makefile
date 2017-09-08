ENUMERATIONS_DIR = enumerations
ENUMS =  $(wildcard $(ENUMERATIONS_DIR)/*.enum)
enum_PCKGS = $(ENUMS)


all : 
	@java -classpath ./lib/*:./ant/bin org.xtext.alma.enumeration.generator.Main --enum-dir $(ENUMERATIONS_DIR)
	
LIBS = lib

clean : 
	@rm -rf generated/*
	@rm -rf ant/*

build : 
	ant -buildfile ant-build.xml all

build-generate-xtext-artifacts : 
	ant -buildfile ant-build.xml generate-xtext-artifacts

build-compile-xtend : 
	ant -buildfile ant-build.xml compile-xtend

build-compile-java : 
	ant -buildfile ant-build.xml compile-java

build-clean : 
	ant -buildfile ant-build.xml clean






