SUMMARY = "A library for parsing, querying, and modifying Devicetree Source v1 files."
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57"

inherit python_setuptools_build_meta pypi

SRC_URI[sha256sum] = "5700c05df89bad8fd729c11aa6f764a3323bcb3796f13b32481ae34445cfc1b7"

BBCLASSEXTEND = "native nativesdk"
