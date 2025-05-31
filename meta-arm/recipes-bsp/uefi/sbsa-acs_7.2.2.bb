require recipes-bsp/uefi/edk2-firmware_202502.bb
PROVIDES:remove = "virtual/bootloader"

LICENSE += "& Apache-2.0"
LIC_FILES_CHKSUM += "file://ShellPkg/Application/sbsa-acs/LICENSE.md;md5=2a944942e1496af1886903d274dedb13"

SRC_URI += "git://github.com/ARM-software/sbsa-acs;destsuffix=edk2/ShellPkg/Application/sbsa-acs;protocol=https;branch=master;name=acs \
            git://github.com/tianocore/edk2-libc;destsuffix=edk2/edk2-libc;protocol=https;branch=master;name=libc \
            file://0001-Patch-in-the-paths-to-the-SBSA-test-suite.patch \
            file://0002-Enforce-using-good-old-BFD-linker.patch \
            "

SRCREV_acs = "642bc12bbc3b526f3931eca580002430c162f2a2"
SRCREV_libc = "7bb4a7886c3b3e359289c03c5638f0174b39ebef"

UPSTREAM_CHECK_URI = "https://github.com/ARM-software/sbsa-acs/releases"

COMPATIBLE_HOST = "aarch64.*-linux"
COMPATIBLE_MACHINE = ""
PACKAGE_ARCH = "${TUNE_PKGARCH}"

EDK2_PLATFORM = "Shell"
EDK2_PLATFORM_DSC = "ShellPkg/ShellPkg.dsc"
EDK2_EXTRA_BUILD = "--module ShellPkg/Application/sbsa-acs/uefi_app/SbsaAvs.inf"

PACKAGES_PATH .= ":${S}/edk2-libc"

do_install() {
    install -d ${D}/firmware
    install ${B}/Build/${EDK2_PLATFORM}/${EDK2_BUILD_MODE}_${EDK_COMPILER}/*/Sbsa.efi ${D}/firmware/
}
