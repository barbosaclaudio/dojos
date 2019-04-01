package br.com.exercicios.commons;

import br.com.exercicios.model.Pessoa;
import com.google.gson.Gson;

import java.util.Arrays;
import java.util.List;

public class PessoaUtils {

    public static List<Pessoa> obterPessoas() {
        Pessoa[] objPessoas = new Gson().fromJson(pessoas, Pessoa[].class);
        return Arrays.asList(objPessoas);
    }

     static final String pessoas = "[\n" +
             "\t{\n" +
             "\t\t\"nome\": \"Jenette\",\n" +
             "\t\t\"email\": \"vitae.diam.Proin@eget.edu\",\n" +
             "\t\t\"dataNascimento\": \"2007-03-03\",\n" +
             "\t\t\"cidade\": \"Salvirola\",\n" +
             "\t\t\"tipo\": \"CLT\"\n" +
             "\t},\n" +
             "\t{\n" +
             "\t\t\"nome\": \"Tanek\",\n" +
             "\t\t\"email\": \"sit.amet@magnaa.co.uk\",\n" +
             "\t\t\"dataNascimento\": \"1998-05-17\",\n" +
             "\t\t\"cidade\": \"Aachen\",\n" +
             "\t\t\"tipo\": \"CLT\"\n" +
             "\t},\n" +
             "\t{\n" +
             "\t\t\"nome\": \"May\",\n" +
             "\t\t\"email\": \"blandit.congue@auctorvelit.net\",\n" +
             "\t\t\"dataNascimento\": \"2014-01-28\",\n" +
             "\t\t\"cidade\": \"Ahmedabad\",\n" +
             "\t\t\"tipo\": \"CLT\"\n" +
             "\t},\n" +
             "\t{\n" +
             "\t\t\"nome\": \"Shelly\",\n" +
             "\t\t\"email\": \"nibh.Aliquam.ornare@justoPraesent.org\",\n" +
             "\t\t\"dataNascimento\": \"1996-07-30\",\n" +
             "\t\t\"cidade\": \"Vejalpur\",\n" +
             "\t\t\"tipo\": \"PJ\"\n" +
             "\t},\n" +
             "\t{\n" +
             "\t\t\"nome\": \"Quincy\",\n" +
             "\t\t\"email\": \"ligula@Sedmalesuada.org\",\n" +
             "\t\t\"dataNascimento\": \"1986-06-06\",\n" +
             "\t\t\"cidade\": \"Ovalle\",\n" +
             "\t\t\"tipo\": \"PJ\"\n" +
             "\t},\n" +
             "\t{\n" +
             "\t\t\"nome\": \"Addison\",\n" +
             "\t\t\"email\": \"Aliquam.auctor@magnaaneque.org\",\n" +
             "\t\t\"dataNascimento\": \"1959-01-17\",\n" +
             "\t\t\"cidade\": \"Ch‰telet\",\n" +
             "\t\t\"tipo\": \"PJ\"\n" +
             "\t},\n" +
             "\t{\n" +
             "\t\t\"nome\": \"Helen\",\n" +
             "\t\t\"email\": \"Nulla@luctusfelispurus.com\",\n" +
             "\t\t\"dataNascimento\": \"1989-11-22\",\n" +
             "\t\t\"cidade\": \"Filot\",\n" +
             "\t\t\"tipo\": \"SUBLOGIN\"\n" +
             "\t},\n" +
             "\t{\n" +
             "\t\t\"nome\": \"Leo\",\n" +
             "\t\t\"email\": \"eu@vitaemauris.net\",\n" +
             "\t\t\"dataNascimento\": \"1967-01-25\",\n" +
             "\t\t\"cidade\": \"Bolsward\",\n" +
             "\t\t\"tipo\": \"SUBLOGIN\"\n" +
             "\t},\n" +
             "\t{\n" +
             "\t\t\"nome\": \"Isadora\",\n" +
             "\t\t\"email\": \"gravida.sagittis.Duis@idnunc.net\",\n" +
             "\t\t\"dataNascimento\": \"1937-04-26\",\n" +
             "\t\t\"cidade\": \"Perinaldo\",\n" +
             "\t\t\"tipo\": \"SUBLOGIN\"\n" +
             "\t},\n" +
             "\t{\n" +
             "\t\t\"nome\": \"Richard\",\n" +
             "\t\t\"email\": \"magna.nec.quam@malesuada.edu\",\n" +
             "\t\t\"dataNascimento\": \"1995-02-12\",\n" +
             "\t\t\"cidade\": \"Annan\",\n" +
             "\t\t\"tipo\": \"NA\"\n" +
             "\t},\n" +
             "\t{\n" +
             "\t\t\"nome\": \"Graham\",\n" +
             "\t\t\"email\": \"mi.lorem.vehicula@Donec.net\",\n" +
             "\t\t\"dataNascimento\": \"1940-06-23\",\n" +
             "\t\t\"cidade\": \"Woking\",\n" +
             "\t\t\"tipo\": \"NA\"\n" +
             "\t},\n" +
             "\t{\n" +
             "\t\t\"nome\": \"Scarlett\",\n" +
             "\t\t\"email\": \"Proin@tinciduntneque.com\",\n" +
             "\t\t\"dataNascimento\": \"1996-02-20\",\n" +
             "\t\t\"cidade\": \"Vancouver\",\n" +
             "\t\t\"tipo\": \"NA\"\n" +
             "\t},\n" +
             "\t{\n" +
             "\t\t\"nome\": \"Daniel\",\n" +
             "\t\t\"email\": \"Cum@risusodioauctor.edu\",\n" +
             "\t\t\"dataNascimento\": \"2015-06-22\",\n" +
             "\t\t\"cidade\": \"North Vancouver\",\n" +
             "\t\t\"tipo\": \"CLT\"\n" +
             "\t},\n" +
             "\t{\n" +
             "\t\t\"nome\": \"Gil\",\n" +
             "\t\t\"email\": \"sem@sociis.com\",\n" +
             "\t\t\"dataNascimento\": \"1922-01-02\",\n" +
             "\t\t\"cidade\": \"Perth\",\n" +
             "\t\t\"tipo\": \"CLT\"\n" +
             "\t},\n" +
             "\t{\n" +
             "\t\t\"nome\": \"Gretchen\",\n" +
             "\t\t\"email\": \"suscipit.nonummy.Fusce@mollisdui.edu\",\n" +
             "\t\t\"dataNascimento\": \"2012-06-15\",\n" +
             "\t\t\"cidade\": \"Wabamun\",\n" +
             "\t\t\"tipo\": \"CLT\"\n" +
             "\t},\n" +
             "\t{\n" +
             "\t\t\"nome\": \"Miriam\",\n" +
             "\t\t\"email\": \"Ut.sagittis@acfacilisis.org\",\n" +
             "\t\t\"dataNascimento\": \"1970-10-17\",\n" +
             "\t\t\"cidade\": \"Sherbrooke\",\n" +
             "\t\t\"tipo\": \"PJ\"\n" +
             "\t},\n" +
             "\t{\n" +
             "\t\t\"nome\": \"Barclay\",\n" +
             "\t\t\"email\": \"Nulla@Maecenaslibero.com\",\n" +
             "\t\t\"dataNascimento\": \"2017-03-07\",\n" +
             "\t\t\"cidade\": \"Stirling\",\n" +
             "\t\t\"tipo\": \"PJ\"\n" +
             "\t},\n" +
             "\t{\n" +
             "\t\t\"nome\": \"Madison\",\n" +
             "\t\t\"email\": \"quis.pede@lectusquismassa.com\",\n" +
             "\t\t\"dataNascimento\": \"1924-06-25\",\n" +
             "\t\t\"cidade\": \"Gateshead\",\n" +
             "\t\t\"tipo\": \"PJ\"\n" +
             "\t},\n" +
             "\t{\n" +
             "\t\t\"nome\": \"Miriam\",\n" +
             "\t\t\"email\": \"eget.varius@Vivamusmolestie.edu\",\n" +
             "\t\t\"dataNascimento\": \"2019-07-10\",\n" +
             "\t\t\"cidade\": \"Pontedera\",\n" +
             "\t\t\"tipo\": \"SUBLOGIN\"\n" +
             "\t},\n" +
             "\t{\n" +
             "\t\t\"nome\": \"Larissa\",\n" +
             "\t\t\"email\": \"sit.amet.consectetuer@nonlobortis.net\",\n" +
             "\t\t\"dataNascimento\": \"2003-08-10\",\n" +
             "\t\t\"cidade\": \"Brixton\",\n" +
             "\t\t\"tipo\": \"SUBLOGIN\"\n" +
             "\t},\n" +
             "\t{\n" +
             "\t\t\"nome\": \"Elizabeth\",\n" +
             "\t\t\"email\": \"Donec.est@primis.co.uk\",\n" +
             "\t\t\"dataNascimento\": \"1997-03-27\",\n" +
             "\t\t\"cidade\": \"Wilhelmshaven\",\n" +
             "\t\t\"tipo\": \"SUBLOGIN\"\n" +
             "\t},\n" +
             "\t{\n" +
             "\t\t\"nome\": \"Quynn\",\n" +
             "\t\t\"email\": \"Quisque.fringilla@InloremDonec.org\",\n" +
             "\t\t\"dataNascimento\": \"1955-08-04\",\n" +
             "\t\t\"cidade\": \"Attigliano\",\n" +
             "\t\t\"tipo\": \"NA\"\n" +
             "\t},\n" +
             "\t{\n" +
             "\t\t\"nome\": \"Karleigh\",\n" +
             "\t\t\"email\": \"placerat.augue.Sed@Fuscealiquet.com\",\n" +
             "\t\t\"dataNascimento\": \"1998-08-28\",\n" +
             "\t\t\"cidade\": \"Collecchio\",\n" +
             "\t\t\"tipo\": \"NA\"\n" +
             "\t},\n" +
             "\t{\n" +
             "\t\t\"nome\": \"Colt\",\n" +
             "\t\t\"email\": \"Class.aptent.taciti@IntegerurnaVivamus.com\",\n" +
             "\t\t\"dataNascimento\": \"1933-09-01\",\n" +
             "\t\t\"cidade\": \"Philadelphia\",\n" +
             "\t\t\"tipo\": \"NA\"\n" +
             "\t},\n" +
             "\t{\n" +
             "\t\t\"nome\": \"Denise\",\n" +
             "\t\t\"email\": \"ligula@euismod.co.uk\",\n" +
             "\t\t\"dataNascimento\": \"2014-09-06\",\n" +
             "\t\t\"cidade\": \"Castelluccio Inferiore\",\n" +
             "\t\t\"tipo\": \"CLT\"\n" +
             "\t},\n" +
             "\t{\n" +
             "\t\t\"nome\": \"Yeo\",\n" +
             "\t\t\"email\": \"tempus@odioPhasellusat.co.uk\",\n" +
             "\t\t\"dataNascimento\": \"1981-02-06\",\n" +
             "\t\t\"cidade\": \"Godhra\",\n" +
             "\t\t\"tipo\": \"CLT\"\n" +
             "\t},\n" +
             "\t{\n" +
             "\t\t\"nome\": \"Jason\",\n" +
             "\t\t\"email\": \"mi.lacinia@loremluctusut.edu\",\n" +
             "\t\t\"dataNascimento\": \"1972-09-30\",\n" +
             "\t\t\"cidade\": \"Delhi\",\n" +
             "\t\t\"tipo\": \"CLT\"\n" +
             "\t},\n" +
             "\t{\n" +
             "\t\t\"nome\": \"Velma\",\n" +
             "\t\t\"email\": \"mi@auctor.com\",\n" +
             "\t\t\"dataNascimento\": \"2014-12-21\",\n" +
             "\t\t\"cidade\": \"Levin\",\n" +
             "\t\t\"tipo\": \"PJ\"\n" +
             "\t},\n" +
             "\t{\n" +
             "\t\t\"nome\": \"Robin\",\n" +
             "\t\t\"email\": \"nulla@ut.com\",\n" +
             "\t\t\"dataNascimento\": \"1988-05-20\",\n" +
             "\t\t\"cidade\": \"Chelsea\",\n" +
             "\t\t\"tipo\": \"PJ\"\n" +
             "\t},\n" +
             "\t{\n" +
             "\t\t\"nome\": \"Julie\",\n" +
             "\t\t\"email\": \"lacus@enim.ca\",\n" +
             "\t\t\"dataNascimento\": \"1991-05-26\",\n" +
             "\t\t\"cidade\": \"FlŽnu\",\n" +
             "\t\t\"tipo\": \"PJ\"\n" +
             "\t},\n" +
             "\t{\n" +
             "\t\t\"nome\": \"Gareth\",\n" +
             "\t\t\"email\": \"aliquet@IncondimentumDonec.com\",\n" +
             "\t\t\"dataNascimento\": \"1957-11-19\",\n" +
             "\t\t\"cidade\": \"Dro\",\n" +
             "\t\t\"tipo\": \"SUBLOGIN\"\n" +
             "\t},\n" +
             "\t{\n" +
             "\t\t\"nome\": \"Ezra\",\n" +
             "\t\t\"email\": \"amet.massa.Quisque@pellentesque.ca\",\n" +
             "\t\t\"dataNascimento\": \"1942-08-13\",\n" +
             "\t\t\"cidade\": \"Saint-Eug�ne-de-Ladri�re\",\n" +
             "\t\t\"tipo\": \"SUBLOGIN\"\n" +
             "\t},\n" +
             "\t{\n" +
             "\t\t\"nome\": \"Jermaine\",\n" +
             "\t\t\"email\": \"a@dolordolortempus.com\",\n" +
             "\t\t\"dataNascimento\": \"1964-10-11\",\n" +
             "\t\t\"cidade\": \"Badajoz\",\n" +
             "\t\t\"tipo\": \"SUBLOGIN\"\n" +
             "\t},\n" +
             "\t{\n" +
             "\t\t\"nome\": \"Hamish\",\n" +
             "\t\t\"email\": \"sed.sapien.Nunc@penatibusetmagnis.net\",\n" +
             "\t\t\"dataNascimento\": \"2004-12-28\",\n" +
             "\t\t\"cidade\": \"Salamanca\",\n" +
             "\t\t\"tipo\": \"NA\"\n" +
             "\t},\n" +
             "\t{\n" +
             "\t\t\"nome\": \"Lester\",\n" +
             "\t\t\"email\": \"varius@dui.edu\",\n" +
             "\t\t\"dataNascimento\": \"1996-12-28\",\n" +
             "\t\t\"cidade\": \"Valladolid\",\n" +
             "\t\t\"tipo\": \"NA\"\n" +
             "\t},\n" +
             "\t{\n" +
             "\t\t\"nome\": \"Joel\",\n" +
             "\t\t\"email\": \"sem.eget.massa@a.ca\",\n" +
             "\t\t\"dataNascimento\": \"2012-09-12\",\n" +
             "\t\t\"cidade\": \"Provo\",\n" +
             "\t\t\"tipo\": \"NA\"\n" +
             "\t},\n" +
             "\t{\n" +
             "\t\t\"nome\": \"Clinton\",\n" +
             "\t\t\"email\": \"vitae.sodales.at@metusInlorem.ca\",\n" +
             "\t\t\"dataNascimento\": \"1970-12-09\",\n" +
             "\t\t\"cidade\": \"Málaga\",\n" +
             "\t\t\"tipo\": \"CLT\"\n" +
             "\t},\n" +
             "\t{\n" +
             "\t\t\"nome\": \"Debra\",\n" +
             "\t\t\"email\": \"sagittis@Inornaresagittis.com\",\n" +
             "\t\t\"dataNascimento\": \"1994-03-05\",\n" +
             "\t\t\"cidade\": \"Bayonne\",\n" +
             "\t\t\"tipo\": \"CLT\"\n" +
             "\t},\n" +
             "\t{\n" +
             "\t\t\"nome\": \"Brendan\",\n" +
             "\t\t\"email\": \"arcu.eu.odio@Donec.com\",\n" +
             "\t\t\"dataNascimento\": \"1983-01-19\",\n" +
             "\t\t\"cidade\": \"Fauglia\",\n" +
             "\t\t\"tipo\": \"CLT\"\n" +
             "\t},\n" +
             "\t{\n" +
             "\t\t\"nome\": \"Wallace\",\n" +
             "\t\t\"email\": \"a@vestibulum.ca\",\n" +
             "\t\t\"dataNascimento\": \"1993-06-20\",\n" +
             "\t\t\"cidade\": \"Rivière-du-Loup\",\n" +
             "\t\t\"tipo\": \"PJ\"\n" +
             "\t},\n" +
             "\t{\n" +
             "\t\t\"nome\": \"Tana\",\n" +
             "\t\t\"email\": \"a.scelerisque.sed@Cum.net\",\n" +
             "\t\t\"dataNascimento\": \"1953-04-29\",\n" +
             "\t\t\"cidade\": \"Redruth\",\n" +
             "\t\t\"tipo\": \"PJ\"\n" +
             "\t},\n" +
             "\t{\n" +
             "\t\t\"nome\": \"Zephr\",\n" +
             "\t\t\"email\": \"Suspendisse.sed.dolor@consequatauctornunc.org\",\n" +
             "\t\t\"dataNascimento\": \"2005-12-20\",\n" +
             "\t\t\"cidade\": \"Dégelis\",\n" +
             "\t\t\"tipo\": \"PJ\"\n" +
             "\t},\n" +
             "\t{\n" +
             "\t\t\"nome\": \"Geoffrey\",\n" +
             "\t\t\"email\": \"vehicula@Pellentesqueultricies.ca\",\n" +
             "\t\t\"dataNascimento\": \"1974-05-16\",\n" +
             "\t\t\"cidade\": \"Sousa\",\n" +
             "\t\t\"tipo\": \"SUBLOGIN\"\n" +
             "\t},\n" +
             "\t{\n" +
             "\t\t\"nome\": \"Amela\",\n" +
             "\t\t\"email\": \"Nunc.ullamcorper@elementum.ca\",\n" +
             "\t\t\"dataNascimento\": \"1997-09-22\",\n" +
             "\t\t\"cidade\": \"Grantham\",\n" +
             "\t\t\"tipo\": \"SUBLOGIN\"\n" +
             "\t},\n" +
             "\t{\n" +
             "\t\t\"nome\": \"Hedley\",\n" +
             "\t\t\"email\": \"libero.Proin@metussit.org\",\n" +
             "\t\t\"dataNascimento\": \"1966-09-19\",\n" +
             "\t\t\"cidade\": \"Valkenburg aan de Geul\",\n" +
             "\t\t\"tipo\": \"SUBLOGIN\"\n" +
             "\t},\n" +
             "\t{\n" +
             "\t\t\"nome\": \"Winter\",\n" +
             "\t\t\"email\": \"dolor.sit@idblanditat.edu\",\n" +
             "\t\t\"dataNascimento\": \"1950-08-18\",\n" +
             "\t\t\"cidade\": \"Québec City\",\n" +
             "\t\t\"tipo\": \"NA\"\n" +
             "\t},\n" +
             "\t{\n" +
             "\t\t\"nome\": \"Tashya\",\n" +
             "\t\t\"email\": \"leo@ultrices.ca\",\n" +
             "\t\t\"dataNascimento\": \"1923-03-03\",\n" +
             "\t\t\"cidade\": \"De Klinge\",\n" +
             "\t\t\"tipo\": \"NA\"\n" +
             "\t},\n" +
             "\t{\n" +
             "\t\t\"nome\": \"Madonna\",\n" +
             "\t\t\"email\": \"ipsum.Suspendisse.non@quamCurabiturvel.ca\",\n" +
             "\t\t\"dataNascimento\": \"2019-12-18\",\n" +
             "\t\t\"cidade\": \"Newport\",\n" +
             "\t\t\"tipo\": \"NA\"\n" +
             "\t},\n" +
             "\t{\n" +
             "\t\t\"nome\": \"Nyssa\",\n" +
             "\t\t\"email\": \"Integer.vulputate.risus@a.org\",\n" +
             "\t\t\"dataNascimento\": \"1960-07-10\",\n" +
             "\t\t\"cidade\": \"Davenport\",\n" +
             "\t\t\"tipo\": \"CLT\"\n" +
             "\t},\n" +
             "\t{\n" +
             "\t\t\"nome\": \"Hedley\",\n" +
             "\t\t\"email\": \"mauris@eget.ca\",\n" +
             "\t\t\"dataNascimento\": \"2012-07-16\",\n" +
             "\t\t\"cidade\": \"Pradamano\",\n" +
             "\t\t\"tipo\": \"CLT\"\n" +
             "\t},\n" +
             "\t{\n" +
             "\t\t\"nome\": \"Branden\",\n" +
             "\t\t\"email\": \"diam@imperdiet.ca\",\n" +
             "\t\t\"dataNascimento\": \"1968-12-12\",\n" +
             "\t\t\"cidade\": \"Saguenay\",\n" +
             "\t\t\"tipo\": \"CLT\"\n" +
             "\t},\n" +
             "\t{\n" +
             "\t\t\"nome\": \"Raja\",\n" +
             "\t\t\"email\": \"elit@Crasdictum.co.uk\",\n" +
             "\t\t\"dataNascimento\": \"2008-07-28\",\n" +
             "\t\t\"cidade\": \"Aosta\",\n" +
             "\t\t\"tipo\": \"PJ\"\n" +
             "\t},\n" +
             "\t{\n" +
             "\t\t\"nome\": \"Jamal\",\n" +
             "\t\t\"email\": \"tristique.aliquet@estNuncullamcorper.edu\",\n" +
             "\t\t\"dataNascimento\": \"1925-02-09\",\n" +
             "\t\t\"cidade\": \"Southampton\",\n" +
             "\t\t\"tipo\": \"PJ\"\n" +
             "\t},\n" +
             "\t{\n" +
             "\t\t\"nome\": \"Keegan\",\n" +
             "\t\t\"email\": \"vel.est.tempor@sociisnatoquepenatibus.co.uk\",\n" +
             "\t\t\"dataNascimento\": \"1957-08-18\",\n" +
             "\t\t\"cidade\": \"Seattle\",\n" +
             "\t\t\"tipo\": \"PJ\"\n" +
             "\t},\n" +
             "\t{\n" +
             "\t\t\"nome\": \"Ella\",\n" +
             "\t\t\"email\": \"elit@miacmattis.ca\",\n" +
             "\t\t\"dataNascimento\": \"1999-05-12\",\n" +
             "\t\t\"cidade\": \"Nieuwerkerken\",\n" +
             "\t\t\"tipo\": \"SUBLOGIN\"\n" +
             "\t},\n" +
             "\t{\n" +
             "\t\t\"nome\": \"Genevieve\",\n" +
             "\t\t\"email\": \"leo@sollicitudinadipiscingligula.ca\",\n" +
             "\t\t\"dataNascimento\": \"1945-07-28\",\n" +
             "\t\t\"cidade\": \"Dover\",\n" +
             "\t\t\"tipo\": \"SUBLOGIN\"\n" +
             "\t},\n" +
             "\t{\n" +
             "\t\t\"nome\": \"Azalia\",\n" +
             "\t\t\"email\": \"risus.Donec@tellusNunc.com\",\n" +
             "\t\t\"dataNascimento\": \"2018-06-03\",\n" +
             "\t\t\"cidade\": \"Couthuin\",\n" +
             "\t\t\"tipo\": \"SUBLOGIN\"\n" +
             "\t},\n" +
             "\t{\n" +
             "\t\t\"nome\": \"Gary\",\n" +
             "\t\t\"email\": \"rutrum.lorem.ac@volutpat.com\",\n" +
             "\t\t\"dataNascimento\": \"1974-07-09\",\n" +
             "\t\t\"cidade\": \"Saumur\",\n" +
             "\t\t\"tipo\": \"NA\"\n" +
             "\t},\n" +
             "\t{\n" +
             "\t\t\"nome\": \"Luke\",\n" +
             "\t\t\"email\": \"nunc@adlitora.ca\",\n" +
             "\t\t\"dataNascimento\": \"1939-03-03\",\n" +
             "\t\t\"cidade\": \"Lorient\",\n" +
             "\t\t\"tipo\": \"NA\"\n" +
             "\t},\n" +
             "\t{\n" +
             "\t\t\"nome\": \"Blossom\",\n" +
             "\t\t\"email\": \"eget.massa@interdumligulaeu.org\",\n" +
             "\t\t\"dataNascimento\": \"1977-01-12\",\n" +
             "\t\t\"cidade\": \"Eindhoven\",\n" +
             "\t\t\"tipo\": \"NA\"\n" +
             "\t},\n" +
             "\t{\n" +
             "\t\t\"nome\": \"Griffin\",\n" +
             "\t\t\"email\": \"vel.est.tempor@tempuseuligula.co.uk\",\n" +
             "\t\t\"dataNascimento\": \"1969-11-10\",\n" +
             "\t\t\"cidade\": \"Thane\",\n" +
             "\t\t\"tipo\": \"CLT\"\n" +
             "\t},\n" +
             "\t{\n" +
             "\t\t\"nome\": \"Erasmus\",\n" +
             "\t\t\"email\": \"sagittis@Nullam.co.uk\",\n" +
             "\t\t\"dataNascimento\": \"1948-08-15\",\n" +
             "\t\t\"cidade\": \"Terme\",\n" +
             "\t\t\"tipo\": \"CLT\"\n" +
             "\t},\n" +
             "\t{\n" +
             "\t\t\"nome\": \"Melinda\",\n" +
             "\t\t\"email\": \"mollis.Phasellus@ac.net\",\n" +
             "\t\t\"dataNascimento\": \"2017-08-06\",\n" +
             "\t\t\"cidade\": \"Ichtegem\",\n" +
             "\t\t\"tipo\": \"CLT\"\n" +
             "\t},\n" +
             "\t{\n" +
             "\t\t\"nome\": \"Zenaida\",\n" +
             "\t\t\"email\": \"interdum.Curabitur.dictum@maurissapiencursus.edu\",\n" +
             "\t\t\"dataNascimento\": \"1965-06-23\",\n" +
             "\t\t\"cidade\": \"Sint-Laureins-Berchem\",\n" +
             "\t\t\"tipo\": \"PJ\"\n" +
             "\t},\n" +
             "\t{\n" +
             "\t\t\"nome\": \"Ethan\",\n" +
             "\t\t\"email\": \"egestas@et.ca\",\n" +
             "\t\t\"dataNascimento\": \"2006-11-24\",\n" +
             "\t\t\"cidade\": \"Molina\",\n" +
             "\t\t\"tipo\": \"PJ\"\n" +
             "\t},\n" +
             "\t{\n" +
             "\t\t\"nome\": \"Piper\",\n" +
             "\t\t\"email\": \"diam.at.pretium@Donectempuslorem.co.uk\",\n" +
             "\t\t\"dataNascimento\": \"1973-10-10\",\n" +
             "\t\t\"cidade\": \"Ham-sur-Heure-Nalinnes\",\n" +
             "\t\t\"tipo\": \"PJ\"\n" +
             "\t},\n" +
             "\t{\n" +
             "\t\t\"nome\": \"Megan\",\n" +
             "\t\t\"email\": \"nibh.dolor.nonummy@arcuac.edu\",\n" +
             "\t\t\"dataNascimento\": \"1926-06-09\",\n" +
             "\t\t\"cidade\": \"Río Negro\",\n" +
             "\t\t\"tipo\": \"SUBLOGIN\"\n" +
             "\t},\n" +
             "\t{\n" +
             "\t\t\"nome\": \"Rhonda\",\n" +
             "\t\t\"email\": \"augue.Sed.molestie@in.net\",\n" +
             "\t\t\"dataNascimento\": \"1978-01-04\",\n" +
             "\t\t\"cidade\": \"Seraing\",\n" +
             "\t\t\"tipo\": \"SUBLOGIN\"\n" +
             "\t},\n" +
             "\t{\n" +
             "\t\t\"nome\": \"Malik\",\n" +
             "\t\t\"email\": \"felis.Donec.tempor@orciconsectetuer.net\",\n" +
             "\t\t\"dataNascimento\": \"1950-11-23\",\n" +
             "\t\t\"cidade\": \"Curitiba\",\n" +
             "\t\t\"tipo\": \"SUBLOGIN\"\n" +
             "\t},\n" +
             "\t{\n" +
             "\t\t\"nome\": \"Venus\",\n" +
             "\t\t\"email\": \"Nunc@fringillami.ca\",\n" +
             "\t\t\"dataNascimento\": \"2012-06-14\",\n" +
             "\t\t\"cidade\": \"Shaftesbury\",\n" +
             "\t\t\"tipo\": \"NA\"\n" +
             "\t},\n" +
             "\t{\n" +
             "\t\t\"nome\": \"Jolene\",\n" +
             "\t\t\"email\": \"id.mollis.nec@consequatnecmollis.org\",\n" +
             "\t\t\"dataNascimento\": \"1982-12-17\",\n" +
             "\t\t\"cidade\": \"Adoni\",\n" +
             "\t\t\"tipo\": \"NA\"\n" +
             "\t},\n" +
             "\t{\n" +
             "\t\t\"nome\": \"Carson\",\n" +
             "\t\t\"email\": \"laoreet.libero.et@hendrerit.com\",\n" +
             "\t\t\"dataNascimento\": \"1929-11-16\",\n" +
             "\t\t\"cidade\": \"Kulti-Barakar\",\n" +
             "\t\t\"tipo\": \"NA\"\n" +
             "\t},\n" +
             "\t{\n" +
             "\t\t\"nome\": \"Dexter\",\n" +
             "\t\t\"email\": \"elit@infaucibusorci.org\",\n" +
             "\t\t\"dataNascimento\": \"1952-03-14\",\n" +
             "\t\t\"cidade\": \"Tortel\",\n" +
             "\t\t\"tipo\": \"CLT\"\n" +
             "\t},\n" +
             "\t{\n" +
             "\t\t\"nome\": \"Ciara\",\n" +
             "\t\t\"email\": \"neque.sed@enimNunc.com\",\n" +
             "\t\t\"dataNascimento\": \"1966-10-01\",\n" +
             "\t\t\"cidade\": \"Sant'Omero\",\n" +
             "\t\t\"tipo\": \"CLT\"\n" +
             "\t},\n" +
             "\t{\n" +
             "\t\t\"nome\": \"Virginia\",\n" +
             "\t\t\"email\": \"a@ornare.org\",\n" +
             "\t\t\"dataNascimento\": \"1943-05-21\",\n" +
             "\t\t\"cidade\": \"Fort Worth\",\n" +
             "\t\t\"tipo\": \"CLT\"\n" +
             "\t},\n" +
             "\t{\n" +
             "\t\t\"nome\": \"Tyrone\",\n" +
             "\t\t\"email\": \"ut@nonantebibendum.ca\",\n" +
             "\t\t\"dataNascimento\": \"1994-10-15\",\n" +
             "\t\t\"cidade\": \"Pontedera\",\n" +
             "\t\t\"tipo\": \"PJ\"\n" +
             "\t},\n" +
             "\t{\n" +
             "\t\t\"nome\": \"Baker\",\n" +
             "\t\t\"email\": \"primis.in.faucibus@maurisa.co.uk\",\n" +
             "\t\t\"dataNascimento\": \"1939-01-02\",\n" +
             "\t\t\"cidade\": \"Leduc\",\n" +
             "\t\t\"tipo\": \"PJ\"\n" +
             "\t},\n" +
             "\t{\n" +
             "\t\t\"nome\": \"Rinah\",\n" +
             "\t\t\"email\": \"in.magna@montesnascetur.net\",\n" +
             "\t\t\"dataNascimento\": \"1921-08-28\",\n" +
             "\t\t\"cidade\": \"LaSalle\",\n" +
             "\t\t\"tipo\": \"PJ\"\n" +
             "\t},\n" +
             "\t{\n" +
             "\t\t\"nome\": \"Upton\",\n" +
             "\t\t\"email\": \"luctus.sit.amet@ullamcorpernislarcu.org\",\n" +
             "\t\t\"dataNascimento\": \"1985-05-02\",\n" +
             "\t\t\"cidade\": \"Derby\",\n" +
             "\t\t\"tipo\": \"SUBLOGIN\"\n" +
             "\t},\n" +
             "\t{\n" +
             "\t\t\"nome\": \"Brent\",\n" +
             "\t\t\"email\": \"nisi.dictum.augue@Nullamvelitdui.org\",\n" +
             "\t\t\"dataNascimento\": \"1927-10-23\",\n" +
             "\t\t\"cidade\": \"Warrnambool\",\n" +
             "\t\t\"tipo\": \"SUBLOGIN\"\n" +
             "\t},\n" +
             "\t{\n" +
             "\t\t\"nome\": \"Tana\",\n" +
             "\t\t\"email\": \"lectus.rutrum.urna@adipiscinglobortis.org\",\n" +
             "\t\t\"dataNascimento\": \"2009-08-08\",\n" +
             "\t\t\"cidade\": \"Ruda\",\n" +
             "\t\t\"tipo\": \"SUBLOGIN\"\n" +
             "\t},\n" +
             "\t{\n" +
             "\t\t\"nome\": \"Addison\",\n" +
             "\t\t\"email\": \"neque@erat.com\",\n" +
             "\t\t\"dataNascimento\": \"1947-11-16\",\n" +
             "\t\t\"cidade\": \"Fremantle\",\n" +
             "\t\t\"tipo\": \"NA\"\n" +
             "\t},\n" +
             "\t{\n" +
             "\t\t\"nome\": \"Lillith\",\n" +
             "\t\t\"email\": \"ornare@netus.edu\",\n" +
             "\t\t\"dataNascimento\": \"2005-04-19\",\n" +
             "\t\t\"cidade\": \"Jonqui�re\",\n" +
             "\t\t\"tipo\": \"NA\"\n" +
             "\t},\n" +
             "\t{\n" +
             "\t\t\"nome\": \"Glenna\",\n" +
             "\t\t\"email\": \"hendrerit.neque@eutempor.org\",\n" +
             "\t\t\"dataNascimento\": \"1964-03-14\",\n" +
             "\t\t\"cidade\": \"Sioux City\",\n" +
             "\t\t\"tipo\": \"NA\"\n" +
             "\t},\n" +
             "\t{\n" +
             "\t\t\"nome\": \"Kay\",\n" +
             "\t\t\"email\": \"justo@vitae.com\",\n" +
             "\t\t\"dataNascimento\": \"2008-05-24\",\n" +
             "\t\t\"cidade\": \"Mellet\",\n" +
             "\t\t\"tipo\": \"CLT\"\n" +
             "\t},\n" +
             "\t{\n" +
             "\t\t\"nome\": \"Melyssa\",\n" +
             "\t\t\"email\": \"primis.in.faucibus@feugiattellus.ca\",\n" +
             "\t\t\"dataNascimento\": \"1988-05-21\",\n" +
             "\t\t\"cidade\": \"Bari\",\n" +
             "\t\t\"tipo\": \"CLT\"\n" +
             "\t},\n" +
             "\t{\n" +
             "\t\t\"nome\": \"Hiram\",\n" +
             "\t\t\"email\": \"et.magnis@commodo.ca\",\n" +
             "\t\t\"dataNascimento\": \"2006-07-15\",\n" +
             "\t\t\"cidade\": \"Kampenhout\",\n" +
             "\t\t\"tipo\": \"CLT\"\n" +
             "\t},\n" +
             "\t{\n" +
             "\t\t\"nome\": \"Edward\",\n" +
             "\t\t\"email\": \"et.risus.Quisque@facilisis.ca\",\n" +
             "\t\t\"dataNascimento\": \"2004-03-16\",\n" +
             "\t\t\"cidade\": \"Comblain-Fairon\",\n" +
             "\t\t\"tipo\": \"PJ\"\n" +
             "\t},\n" +
             "\t{\n" +
             "\t\t\"nome\": \"Flavia\",\n" +
             "\t\t\"email\": \"odio.Etiam@dictumultriciesligula.net\",\n" +
             "\t\t\"dataNascimento\": \"1962-10-19\",\n" +
             "\t\t\"cidade\": \"Drancy\",\n" +
             "\t\t\"tipo\": \"PJ\"\n" +
             "\t},\n" +
             "\t{\n" +
             "\t\t\"nome\": \"Maris\",\n" +
             "\t\t\"email\": \"iaculis.odio@amet.co.uk\",\n" +
             "\t\t\"dataNascimento\": \"1932-02-27\",\n" +
             "\t\t\"cidade\": \"Bridgwater\",\n" +
             "\t\t\"tipo\": \"PJ\"\n" +
             "\t},\n" +
             "\t{\n" +
             "\t\t\"nome\": \"Warren\",\n" +
             "\t\t\"email\": \"at.augue@mauris.org\",\n" +
             "\t\t\"dataNascimento\": \"1961-09-24\",\n" +
             "\t\t\"cidade\": \"South Portland\",\n" +
             "\t\t\"tipo\": \"SUBLOGIN\"\n" +
             "\t},\n" +
             "\t{\n" +
             "\t\t\"nome\": \"Kirk\",\n" +
             "\t\t\"email\": \"varius@sed.net\",\n" +
             "\t\t\"dataNascimento\": \"1939-06-20\",\n" +
             "\t\t\"cidade\": \"Essex\",\n" +
             "\t\t\"tipo\": \"SUBLOGIN\"\n" +
             "\t},\n" +
             "\t{\n" +
             "\t\t\"nome\": \"Inez\",\n" +
             "\t\t\"email\": \"magna.Cras.convallis@nequeMorbiquis.net\",\n" +
             "\t\t\"dataNascimento\": \"1980-03-08\",\n" +
             "\t\t\"cidade\": \"Woodstock\",\n" +
             "\t\t\"tipo\": \"SUBLOGIN\"\n" +
             "\t},\n" +
             "\t{\n" +
             "\t\t\"nome\": \"Bree\",\n" +
             "\t\t\"email\": \"Sed.malesuada@consequatnec.org\",\n" +
             "\t\t\"dataNascimento\": \"1950-02-13\",\n" +
             "\t\t\"cidade\": \"Boise\",\n" +
             "\t\t\"tipo\": \"NA\"\n" +
             "\t},\n" +
             "\t{\n" +
             "\t\t\"nome\": \"Ciaran\",\n" +
             "\t\t\"email\": \"mi.lacinia.mattis@dolor.co.uk\",\n" +
             "\t\t\"dataNascimento\": \"2007-05-07\",\n" +
             "\t\t\"cidade\": \"Requínoa\",\n" +
             "\t\t\"tipo\": \"NA\"\n" +
             "\t},\n" +
             "\t{\n" +
             "\t\t\"nome\": \"Holmes\",\n" +
             "\t\t\"email\": \"vulputate@Utsemper.org\",\n" +
             "\t\t\"dataNascimento\": \"1981-06-14\",\n" +
             "\t\t\"cidade\": \"Blenheim\",\n" +
             "\t\t\"tipo\": \"NA\"\n" +
             "\t},\n" +
             "\t{\n" +
             "\t\t\"nome\": \"Jena\",\n" +
             "\t\t\"email\": \"vel.nisl@tincidunt.org\",\n" +
             "\t\t\"dataNascimento\": \"1938-02-09\",\n" +
             "\t\t\"cidade\": \"Madison\",\n" +
             "\t\t\"tipo\": \"CLT\"\n" +
             "\t},\n" +
             "\t{\n" +
             "\t\t\"nome\": \"Uriah\",\n" +
             "\t\t\"email\": \"eu.enim.Etiam@eget.edu\",\n" +
             "\t\t\"dataNascimento\": \"1952-08-20\",\n" +
             "\t\t\"cidade\": \"Lautaro\",\n" +
             "\t\t\"tipo\": \"CLT\"\n" +
             "\t},\n" +
             "\t{\n" +
             "\t\t\"nome\": \"Irene\",\n" +
             "\t\t\"email\": \"eu@interdumSed.co.uk\",\n" +
             "\t\t\"dataNascimento\": \"2000-01-14\",\n" +
             "\t\t\"cidade\": \"Monte San Savino\",\n" +
             "\t\t\"tipo\": \"CLT\"\n" +
             "\t},\n" +
             "\t{\n" +
             "\t\t\"nome\": \"Jessica\",\n" +
             "\t\t\"email\": \"nunc@Donec.edu\",\n" +
             "\t\t\"dataNascimento\": \"1944-04-28\",\n" +
             "\t\t\"cidade\": \"Esneux\",\n" +
             "\t\t\"tipo\": \"PJ\"\n" +
             "\t}\n" +
             "]";
}
