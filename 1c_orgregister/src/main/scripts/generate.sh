#!/usr/bin/env bash

#out="../../../target/generated-sources/annotations"
out="../../../src/main/java"
cd `dirname $0`
mkdir -p $out
wsimport -Xauthfile auth.txt -s $out -Xnocompile https://api.orgregister.1c.ru/orgregister/v7?wsdl
#wsimport -Xauthfile auth.txt -clientjar wsimport-generated.jar https://api.orgregister.1c.ru/orgregister/v7?wsdl
#mvn install:install-file -Dfile=wsimport-generated.jar -DgroupId=ru.com.m74.1c -DartifactId=wsimport-generated -Dversion=1.0 -Dpackaging=jar
#rm wsimport-generated.jar
# -DlocalRepositoryPath=<path>
cd -