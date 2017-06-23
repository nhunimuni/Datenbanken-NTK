package info.goolap.beuth.jdbc.Storage.Person_DataAccessObject;

/**
 * @author Alexander L�ser
 *         This class implements a single place of  RDBMS tables to java variables.
 */
public class SQL_Statements {

    // mappings for simple example
    final static String TBL_person = "PERSON";
    final static String COL_person_id = "person_id";
    final static String COL_first_name = "first_name";
    final static String COL_last_name = "last_name";
    final static String COL_born_date = "born_date";

    // mappings for simple example
    final static String TBL_anfrage = "anfrage";
    final static String an_anfr_id = "anfrage.anfr_id";
    final static String an_text = "anfrage.text";
    final static String an_datum = "anfrage.datum";

    // mappings for simple example
    final static String TBL_bewertung = "bewertung";
    final static String be_jury_m = "bewertung.jury_m";
    final static String be_teilnehmer = "bewertung.teilnehmer";

    // mappings for simple example
    final static String TBL_ergbenis = "ergebnis";
    final static String er_text = "ergebnis.text";
    final static String er_url = "ergebnis.url";
    final static String er_id_anfrage = "ergebnis.id_anfrage";

    // mappings for simple example
    final static String TBL_inhalt = "inhalt";
    final static String in_datum = "inhalt.datum";
    final static String in_person = "inhalt.person";

    // mappings for simple example
    final static String TBL_jurymitglieder = "jurymitglieder";
    final static String ju_name = "jurymitglieder.name";
    final static String ju_berufsfeld = "jurymitglieder.berufsfeld";
    final static String ju_event = "jurymitglieder.event";

    // mappings for simple example
    final static String TBL_kandidat = "kandidat";
    final static String ka_name = "kandidat.name";
    final static String ka_staat = "kandidat.staat";

    // mappings for simple example
    final static String TBL_miss_usa_contest = "miss_usa_contest";
    final static String mi_beginn = "miss_usa_contest.beginn";
    final static String mi_ende = "miss_usa_contest.ende";
    final static String mi_ort = "miss_usa_contest.ort";

    // mappings for simple example
    final static String TBL_mitglied = "mitglied";
    final static String mit_jury_m = "mitglied.jury_m";
    final static String mit_zeitpunkt = "mitglied.zeitpunkt";
    final static String mit_event = "mitglied.event";

    // mappings for simple example
    final static String TBL_teilnahme = "teilnahme";
    final static String te_platzierung = "teilnahme.platzierung";
    final static String te_teilnehmerin = "teilnahme.teilnehmerin";
    final static String te_zeit = "teilnahme.zeit";

    // mappings for simple example
    final static String TBL_website = "website";
    final static String we_url = "teilnahme.url";
    final static String we_rank = "teilnahme.rank";
    final static String we_inhalt = "teilnahme.inhalt";


    // example queries
    final static String SELECT_STAR_FROM_PERSONS = "select * from " + TBL_person;
    final static String SELECT_PERSONS_WITH_YEAR = "select * from " + TBL_person + " where " + COL_born_date + " < ? ";
    final static String INSERT_PERSON = "insert into " + TBL_person
            + "(" +
            COL_person_id + ", " +
            COL_first_name + ", " +
            COL_last_name + ", " +
            COL_born_date + ") values (?, ?, ?, ?)";

    final static String DELETE_PERSON = "delete  from " + TBL_person + " where  " + COL_person_id + " = ? ";
}
