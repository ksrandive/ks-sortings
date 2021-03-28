import com.ks.learning.quickSort.QuickSort
import spock.lang.Specification

class QuickSortTest extends Specification {

    def app = new QuickSort();
    def array = [-55, -20, -10, -1, 1, 12, 15, 18, 55, 80]

    def "quickSortTest"() {
        when:
        int[] a = app.runQuickSort()
        then:
        a == array
    }
}
