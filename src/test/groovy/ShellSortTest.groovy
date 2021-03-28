import com.ks.learning.shellSort.ShellSort
import spock.lang.Specification

class ShellSortTest extends Specification {

    def app = new ShellSort()
    def array = [-55, -20, -10, -1, 1, 12, 15, 18, 55, 80]

    def "shellSortTest"() {
        when:
        int[] a = app.shellSort()
        then:
        a == array
    }
}
