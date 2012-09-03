#! /bin/sh

BOOST_PATH=/Developer/Tools/boost

mkdir -p java/com/shimanski/eufe
mkdir -p java/jni
mkdir -p java/jni/ThirdParty

swig -c++ -java -package com.shimanski.eufe -outdir java/com/shimanski/eufe -o java/jni/eufe_wrap.cxx eufe/eufe/swig/eufe.i
cp eufe/eufe/*.cpp java/jni/
cp eufe/eufe/*.h java/jni/
cp eufe/eufe/ThirdParty/*.* java/jni/ThirdParty

cp Android.mk java/jni/Android.mk
cp Application.mk java/jni/Application.mk

ndk-build -C java/jni