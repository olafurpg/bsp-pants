jar_library(
    name = "junit",
    jars = [
        jar(
            org = "junit",
            name = "junit",
            rev = "4.12",
        ),
    ],
    scope = "forced",
    dependencies = [
        ":junit-runner-annotations",
        "3rdparty/jvm/org/hamcrest:hamcrest-core",
    ],
)

jar_library(
    name = "junit-runner-annotations",
    jars = [
        jar(
            org = "org.pantsbuild",
            name = "junit-runner-annotations",
            rev = "0.0.11",
        ),
    ],
    # Frequently used for its annotations.
    scope = "forced",
)
