require recipes-bsp/trusted-firmware-m/trusted-firmware-m-1.8.0-src.inc
require recipes-bsp/trusted-firmware-m/trusted-firmware-m.inc

SRC_URI += "file://0001-arm-trusted-firmware-m-disable-fatal-warnings.patch"
