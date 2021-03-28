import com.ks.learning.countSort.CountSort
import spock.lang.Specification

class CountSortTest extends Specification {

    def app = new CountSort()
    def array = [8, 2, 10, 1, 5, 2, 8, 5, 5, 1]

    def "countSortTest"() {
        when:
        int[] a = app.runCountSort()
        then:
        a == array.sort()
    }
}
