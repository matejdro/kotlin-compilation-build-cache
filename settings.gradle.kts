rootProject.name = "sample"
includeBuild("build-conventions")
include("application", "utilities", "list", "dummy-project-a", "dummy-project-b", "dummy-project-c", "dummy-project-d", "dummy-project-e", "dummy-project-f")

buildCache {
    local {
        isEnabled = false
    }
    remote<HttpBuildCache> {
        isEnabled = true
        isPush = true
        isAllowUntrustedServer = true
        isAllowInsecureProtocol = true
        setUrl("http://localhost:5071/cache")
    }
}
