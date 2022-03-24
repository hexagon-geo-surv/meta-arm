SUMMARY = "OpenCSD - An open source CoreSight(tm) Trace Decode library"
HOMEPAGE = "https://github.com/Linaro/OpenCSD"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=ad8cb685eb324d2fa2530b985a43f3e5"

SRC_URI = "git://github.com/Linaro/OpenCSD;protocol=https;branch=master"
SRCREV = "8dab50c35c8d181fc3ed6ad46e156398447d753f"

S = "${WORKDIR}/git"

# For now we only build with GCC, so stop meta-clang trying to get involved
TOOLCHAIN = "gcc"

COMPATIBLE_HOST = "(i.86|x86_64|arm|aarch64).*-linux"

EXTRA_OEMAKE = "ARCH='${TARGET_ARCH}' \
                CROSS_COMPILE='${TARGET_SYS}-' \
                CC='${CC}' \
                CXX='${CXX}' \
                LIB='${AR}' \
                LINKER='${CXX}' \
                LINUX64=1 \
                DEBUG=1 \
                PREFIX=${D}/usr \
                INSTALL_BIN_DIR=${D}${bindir} \
                INSTALL_INCLUDE_DIR=${D}${includedir} \
                INSTALL_LIB_DIR=${D}${libdir} \
                INSTALL_MAN_DIR=${D}${mandir}/man1 \
                "

do_compile() {
    oe_runmake -C ${S}/decoder/build/linux
}

do_install() {
    oe_runmake -C ${S}/decoder/build/linux install install_man
}

BBCLASSEXTEND = "native"
