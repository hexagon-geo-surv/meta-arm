SUMMARY = "Python package for creating beautiful command line interfaces"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://PKG-INFO;beginline=8;endline=8;md5=77d9066068d13ffd309659977e9909c9"
HOMEPAGE = "https://github.com/pallets/click"

inherit pypi python_pep517

SRC_URI[sha256sum] = "ed53c9d8990d83c2a27deae68e4ee337473f6330c040a31d4225c9574d16096a"

BBCLASSEXTEND = "native nativesdk"
