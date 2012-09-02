set BOOST_PATH=/Programing/boost_1_51_0

mkdir java\com\shimanski\eufe
mkdir java\jni
mkdir java\jni\ThirdParty

swig.exe -c++ -java -package com.shimanski.eufe -outdir java\com\shimanski\eufe -o java\jni\eufe_wrap.cxx eufe\eufe\swig\eufe.i
copy eufe\eufe\*.cpp java\jni\
copy eufe\eufe\*.h java\jni\
copy eufe\eufe\ThirdParty\*.* java\jni\ThirdParty

copy Android.mk java\jni\Android.mk
copy Application.mk java\jni\Application.mk

ndk-build -C java/jni