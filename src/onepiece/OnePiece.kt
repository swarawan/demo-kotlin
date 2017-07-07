package onepiece

/**
 * Created by rioswarawan on 7/6/17.
 */

fun main(args: Array<String>) {
    val onePiece: OnePiece = OnePiece()
    onePiece.intro()
}

class OnePiece {

    companion object PLAYER {
        val _1: Int = 1
        val _2: Int = 2
    }

    val charUtils: CharacterUtils = CharacterUtils()
    val fight: Fight = Fight()

    fun intro() {
        printHeader()
        chooseCharacters()
    }

    fun printHeader() {
        println("ONE PIECE - PERTARUNGAN")
        println()
    }

    private fun chooseCharacters() {
        println("List Karakter:")
        val charSize = charUtils.allChar().size
        for ((index, character) in charUtils.allChar().withIndex())
            println((index + 1).toString() + ". " + character.name)

        player1Choose(charSize)
        player2Choose(charSize)
        fightNow()
    }

    private fun fightNow() {
        println("==============================================")
        println("Player 1 : " + fight.getPlayer1()?.name)
        println("Player 2 : " + fight.getPlayer2()?.name)
        print("Mulai pertarungan? (y/n)")
        val inputInfo = readLine()

        if (inputInfo?.toLowerCase().equals("y")) {
            fight.fightNow()
        } else {
            println("==============================================")
            println()

            chooseCharacters()
        }
    }

    private fun player1Choose(charSize: Int) {
        println()
        print("Player 1 pilih (1..$charSize): ")
        val charPosition = (readLine().toString().toInt()) - 1
        val character: Character = charUtils.getChar(charPosition)

        infoQUestion(PLAYER._1, character)
    }

    private fun player2Choose(charSize: Int) {
        println()
        print("Player 2 pilih (1..$charSize): ")
        val charPosition = (readLine().toString().toInt()) - 1
        val character: Character = charUtils.getChar(charPosition)
        if (!isCharAvailable(character)) {
            println("Tidak bisa memilih karakter yang sama")
        } else {
            infoQUestion(PLAYER._2, character)
        }
    }

    private fun isCharAvailable(character: Character): Boolean {
        val player1Character = fight.getPlayer1()
        return character.id != player1Character?.id
    }

    private fun infoQUestion(player: Int, character: Character) {
        println("Memilih " + character.name)
        println("1. Pilih")
        println("2. Lihat Info")
        print("Pilihan (1..2):")
        val inputInfo = (readLine().toString().toInt())
        if (inputInfo == 1) {
            println("Player " + player + " memilih " + character.name)
            fight.selectCharacter(player, character)
        } else if (inputInfo == 2) {
            getInfo(player, character)
        } else {
            println("Pilihan tidak valid")
            infoQUestion(player, character)
        }
    }

    private fun getInfo(player: Int, character: Character) {
        println("INFORMASI KARAKTER")
        println("Nama: " + character.name)
        println("HP: " + character.hp)
        println("Mana: " + character.mana)
        println("Kemampuan: ")

        val skills: List<Skill> = character.skills
        for (skill in skills.withIndex())
            println("- " + skill.value.name + " (atk: " + skill.value.atk + ", mana: " + skill.value.mana + ")")

        println()
        println()
        infoQUestion(player, character)
    }
}
