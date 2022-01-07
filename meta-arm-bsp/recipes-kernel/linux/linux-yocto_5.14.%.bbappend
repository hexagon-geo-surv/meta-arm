FILESEXTRAPATHS:prepend := "${THISDIR}/linux-yocto-5.14:"

SRC_URI:append = " file://defconfig.patch"
