package onepiece

/**
 * Created by rioswarawan on 7/6/17.
 */

class CharacterUtils {

    var chars: MutableList<Character> = ArrayList()

    fun allChar(): List<Character> {
        if (chars.size == 0) {
            chars.add(Luffy())
            chars.add(Zoro())
        }

        return chars
    }

    fun getChar(position: Int): Character {
        val character: Character = chars.get(position)
        return character
    }

    private fun Luffy(): Character {
        val character: Character = Character(1, "Monkey D. Luffy", 500, 100, "", listOf(
                Skill("Gomu Gomu no Pistol", 20, 5),
                Skill("Gomu Gomu no Rocket", 30, 10),
                Skill("Gomu Gomu no Bazooka", 40, 15),
                Skill("Gomu Gomu no Gatling", 50, 20)
        ))
        return character
    }

    private fun Zoro(): Character {
        var character: Character = Character(2, "Roronoa Zoro", 450, 100, "", listOf(
                Skill("Santoryu", 30, 5),
                Skill("Nitoryu", 40, 10),
                Skill("Ittoryu", 50, 15),
                Skill("Mutoryu", 60, 20),
                Skill("Kyutoryu", 70, 30)
        ))
        return character
    }
}

data class Character(val id: Int, val name: String, val hp: Int, val mana: Int, val story: String, val skills: List<Skill>)

data class Skill(val name: String, val atk: Int, val mana: Int)