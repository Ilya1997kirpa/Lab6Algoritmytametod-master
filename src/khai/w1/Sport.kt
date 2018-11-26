package khai.w1


import khai.general.League
import khai.general.TypeSports
import khai.general.Country


interface Sport{
    //Content
    var club: String
    var typeSports: TypeSports
    var yearofFoundation: String
    var city: String
    var country: Country
    var coach: String
    var captain: String
    var stadium: String
    // Tech data
    var holder: String
    var league: League

       //  Usage data
    var mark: Int
    var overlooked: Boolean
    var price: Double
    var rating:Int

    fun getShortInfo():String = "(Клуб: $club, Вид спорта: $typeSports)"

    fun getInfo():String = "$country, $city"

    fun setBasicInformation(club: String, typeSport: TypeSports, yearofFoundation: String): Sport

    fun setContentInfo(typeSport: TypeSports, club: String, city:String, stadium: String, captain: String,
                       coach: String,yearofFoundation : String, holder: String): Sport


    //    w3
    enum class SportsFields{
        club,
        typeSports,
        yearofFoundation,
        city,
        country,
        stadium,
        coach,
        captain,
        holder,
        league,
        price,
         mark,
        overlooked;
    }
    fun getFieldName(): List<String> = SportsFields.values().toList().map { it.name }

    //w4
    fun getFieldValue(field: SportsFields) = when(field){
        SportsFields.club -> this::club
        SportsFields.typeSports -> this::typeSports
        SportsFields.yearofFoundation ->this::yearofFoundation
        SportsFields.city-> this::city
        SportsFields.country ->this::country
        SportsFields.coach -> this::coach
       SportsFields.captain -> this::captain
        SportsFields.holder ->this::holder
        SportsFields.league ->this::league
        SportsFields.mark ->this::mark
        SportsFields.stadium -> this::stadium
        SportsFields.overlooked -> this::overlooked
        SportsFields.price -> this::price
    }
}