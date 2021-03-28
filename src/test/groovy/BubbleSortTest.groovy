import com.ks.learning.bubbleSort.BubbleSort
import spock.lang.Specification


class BubbleSortTest extends Specification {

    def app = new BubbleSort()
    def array = [-55, -20, -10, -1, 1, 12, 15, 18, 55, 80]

    def "bubbleSortTest"() {
        when:
        int[] a = app.bubbleSort()
        then:
        a == array
    }
}
