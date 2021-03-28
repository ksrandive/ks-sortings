import com.ks.learning.insertionSort.InsertionSort
import spock.lang.Specification

class InsertionSortTest extends Specification {

    def app = new InsertionSort();
    def array = [-55, -20, -10, -1, 1, 12, 15, 18, 55, 80]

    def "insertionSortTest"() {
        when:
        int[] a = app.insertionSort()
        then:
        a == array
    }
}
