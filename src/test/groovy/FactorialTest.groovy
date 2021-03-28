import com.ks.learning.recursion.Factorial
import spock.lang.Specification

class FactorialTest extends Specification {

    def app = new Factorial()
    def factorial = 120

    def "factorialTest"() {
        when:
        int a = app.runFactorial()
        then:
        a == factorial
    }
}
