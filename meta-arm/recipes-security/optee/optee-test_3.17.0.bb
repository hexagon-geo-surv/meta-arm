require optee-test.inc

SRC_URI:append = " \
    file://musl-workaround.patch \
   "

SRCREV = "44a31d02379bd8e50762caa5e1592ad81e3339af"
