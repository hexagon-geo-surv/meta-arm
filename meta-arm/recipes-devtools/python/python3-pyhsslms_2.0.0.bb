SUMMARY = "Pure-Python implementation of HSS/LMS Digital Signatures (RFC 8554)"
HOMEPAGE ="https://pypi.org/project/pyhsslms"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=bbc59ef8bf238c2902ca816b87b58571"

inherit python_setuptools_build_meta
#PYPI_PACKAGE = "pyhsslms"
SRC_URI = "https://github.com/russhousley/pyhsslms/archive/refs/tags/${PV}.tar.gz"
SRC_URI[sha256sum] = "d85624a5b54ddc66af0c975531943db90f3e9a2aee95724ec7755f7cc7826ce3"

S = "${WORKDIR}/pyhsslms-${PV}"

BBCLASSEXTEND = "native nativesdk"
