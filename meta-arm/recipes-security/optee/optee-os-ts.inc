# Include Trusted Services SPs accordingly to defined machine features

# Please notice that OPTEE will load SPs in the order listed in this file.
# If an SP requires another SP to be already loaded it must be listed lower.

# TS SPs UUIDs definitions
require recipes-security/trusted-services/ts-uuid.inc

TS_ENV = "opteesp"
TS_BIN = "${RECIPE_SYSROOT}/usr/${TS_ENV}/bin"

# ITS SP
DEPENDS:append  = "${@bb.utils.contains('MACHINE_FEATURES', 'ts-its', \
                                        ' ts-sp-its', '' , d)}"
SP_PATHS:append = "${@bb.utils.contains('MACHINE_FEATURES', 'ts-its', \
                                        ' ${TS_BIN}/${ITS_UUID}.stripped.elf', '', d)}"

# Storage SP
DEPENDS:append  = "${@bb.utils.contains('MACHINE_FEATURES', 'ts-storage', \
                                        ' ts-sp-storage', '' , d)}"
SP_PATHS:append = "${@bb.utils.contains('MACHINE_FEATURES', 'ts-storage', \
                                        ' ${TS_BIN}/${STORAGE_UUID}.stripped.elf', '', d)}"

# Crypto SP.
DEPENDS:append  = "${@bb.utils.contains('MACHINE_FEATURES', 'ts-crypto', \
                                        ' ts-sp-crypto', '' , d)}"
SP_PATHS:append = "${@bb.utils.contains('MACHINE_FEATURES', 'ts-crypto', \
                                        ' ${TS_BIN}/${CRYPTO_UUID}.stripped.elf', '', d)}"

# Attestation SP
DEPENDS:append  = "${@bb.utils.contains('MACHINE_FEATURES', 'ts-attestation', \
                                        ' ts-sp-attestation', '' , d)}"
SP_PATHS:append = "${@bb.utils.contains('MACHINE_FEATURES', 'ts-attestation', \
                                        ' ${TS_BIN}/${ATTESTATION_UUID}.stripped.elf', '', d)}"

# Env-test SP
DEPENDS:append  = "${@bb.utils.contains('MACHINE_FEATURES', 'ts-env-test', \
                                        ' ts-sp-env-test', '' , d)}"
SP_PATHS:append = "${@bb.utils.contains('MACHINE_FEATURES', 'ts-env-test', \
                                        ' ${TS_BIN}/${ENV_TEST_UUID}.stripped.elf', '', d)}"

# SE-Proxy SP
DEPENDS:append  = "${@bb.utils.contains('MACHINE_FEATURES', 'ts-se-proxy', \
                                        ' ts-sp-se-proxy', '' , d)}"
SP_PATHS:append = "${@bb.utils.contains('MACHINE_FEATURES', 'ts-se-proxy', \
                                        ' ${TS_BIN}/${SE_PROXY_UUID}.stripped.elf', '', d)}"

# SMM Gateway
DEPENDS:append  = "${@bb.utils.contains('MACHINE_FEATURES', 'ts-smm-gateway', \
                                        ' ts-sp-smm-gateway', '' , d)}"
SP_PATHS:append = "${@bb.utils.contains('MACHINE_FEATURES', 'ts-smm-gateway', \
                                        ' ${TS_BIN}/${SMM_GATEWAY_UUID}.stripped.elf', '', d)}"

# SPM test SPs
DEPENDS:append  = "${@bb.utils.contains('MACHINE_FEATURES', 'optee-spmc-test', \
                                        ' ts-sp-spm-test1 ts-sp-spm-test2 ts-sp-spm-test3', '' , d)}"
SP_PATHS:append = "${@bb.utils.contains('MACHINE_FEATURES', 'optee-spmc-test', \
                                        ' ${TS_BIN}/${SPM_TEST1_UUID}.stripped.elf ${TS_BIN}/${SPM_TEST2_UUID}.stripped.elf ${TS_BIN}/${SPM_TEST3_UUID}.stripped.elf', '', d)}"
EXTRA_OEMAKE:append = "${@bb.utils.contains('MACHINE_FEATURES', 'optee-spmc-test', \
                                        ' CFG_SPMC_TESTS=y', '' , d)}"

# Block Storage SP
DEPENDS:append  = "${@bb.utils.contains('MACHINE_FEATURES', 'ts-block-storage', \
                                        ' ts-sp-block-storage', '' , d)}"

SP_PATHS:append = "${@bb.utils.contains('MACHINE_FEATURES', 'ts-block-storage', \
                                        ' ${TS_BIN}/${BLOCK_STORAGE_UUID}.stripped.elf', '', d)}"

EXTRA_OEMAKE:append = "${@oe.utils.conditional('SP_PATHS', '', '', ' CFG_MAP_EXT_DT_SECURE=y CFG_SECURE_PARTITION=y SP_PATHS="${SP_PATHS}" ', d)}"
