ARMFILESPATHS := "${THISDIR}/files:"

FILESEXTRAPATHS:prepend:aarch64 = "${ARMFILESPATHS}"
SRC_URI:append:aarch64 = " \
    file://0001-net-stmmac-tegra-Add-MGBE-support.patch \
    file://0002-Revert-arm64-defconfig-Add-Nuvoton-NPCM-family-suppo.patch \
    "
