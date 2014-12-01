package demo

import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(Game)
class GameSpec extends Specification {

    void "test something"() {
        setup:
        def setupGame = new Game(score: [1, 2, 4]).save()

        when:
        def g = Game.get(setupGame.id)

        then:
        g.score == [1, 2, 4]
    }
}
