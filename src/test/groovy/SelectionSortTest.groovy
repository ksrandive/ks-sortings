import com.ks.learning.selectionSort.SelectionSort
import spock.lang.Specification

class SelectionSortTest extends Specification {

    def app = new SelectionSort()
    def array = [-55, -20, -10, -1, 1, 12, 15, 18, 55, 80]

    def "selectionSortTest"() {
        when:
        int[] a = app.selectionSort()
        then:
        a == array
    }
}
