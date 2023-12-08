/**
 * Precompiled [myproject.greeting.gradle.kts][Myproject_greeting_gradle] script plugin.
 *
 * @see Myproject_greeting_gradle
 */
public
class Myproject_greetingPlugin : org.gradle.api.Plugin<org.gradle.api.Project> {
    override fun apply(target: org.gradle.api.Project) {
        try {
            Class
                .forName("Myproject_greeting_gradle")
                .getDeclaredConstructor(org.gradle.api.Project::class.java, org.gradle.api.Project::class.java)
                .newInstance(target, target)
        } catch (e: java.lang.reflect.InvocationTargetException) {
            throw e.targetException
        }
    }
}
