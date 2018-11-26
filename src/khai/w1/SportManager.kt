package khai.w1

object SportManager : ADDREMOVE{

    private val sportslist: MutableList<Sport> = mutableListOf()

    private val controller : ADDREMOVE = ListADDREMOVE(sportslist)

    override fun add(sport: Sport): Boolean  = controller.add(sport)
    override fun remove(sport: Sport): Boolean = controller.remove(sport)
    override fun contains(sport: Sport): Boolean = controller.contains(sport)
    override fun getAll(): Collection<Sport> = controller.getAll()


}