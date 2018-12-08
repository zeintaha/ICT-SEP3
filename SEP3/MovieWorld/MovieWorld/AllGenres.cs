using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Drawing;
using System.Data;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using System.IO;

namespace MovieWorld
{
    public partial class AllGenres : UserControl
    {

        BackgroundWorker worker;
        private delegate void Delegate();
        
        public AllGenres()
        {
            InitializeComponent();
            worker = new BackgroundWorker();

        }


        private void flowLayoutPanel1_Paint(object sender, PaintEventArgs e)
        {

        }

        private void worker_doWork(object sender, DoWorkEventArgs e)
        {
            Delegate del = new Delegate(CreateLayout);
            this.Invoke(del);

        }


        public void CreateLayout()
        {

            Movie movie1 = new Movie();
            movie1.Name = "A Prayer Before Dawn 2018";
            movie1.MovieId = "1";
            movie1.Genre = "Drama";
            movie1.Director = "Jean-Stephane Sauvaire";
            movie1.Discription = "The true story of Billy Moore, an English boxer incarcerated in Thailand's most notorious prison. Thrown into a world of drugs and violence, he finds his best chance to escape is to fight his way out in Muay Thai tournaments.";
            movie1.Duration = "90 miutes";
            movie1.UrlTrailer = "https://sep3.blob.core.windows.net/mediacontainer/A%20Prayer%20Before%20Dawn%202018_trailer.mov";
            movie1.UrlImage = "https://sep3.blob.core.windows.net/mediacontainer/A%20Prayer%20Before%20Dawn%202018.jpg";
            movie1.UrlFullMovie = "https://sep3.blob.core.windows.net/mediacontainer/A%20Prayer%20Before%20Dawn%202018.mov";

            Movie movie2 = new Movie();
            movie2.Name = "Alpha 2018";
            movie2.MovieId = "2";
            movie2.Genre = "Adventure";
            movie2.Director = "Albert Hughes";
            movie2.Discription = "In the prehistoric past, Keda, a young and inexperienced hunter, struggles to return home after being separated from his tribe when bison hunting goes awry. On his way back he will find an unexpected ally.";
            movie2.Duration = "105 miutes";
            movie2.UrlTrailer = "https://sep3.blob.core.windows.net/mediacontainer/Alpha%202018_trailer.mov";
            movie2.UrlImage = "https://sep3.blob.core.windows.net/mediacontainer/Alpha%202018.jpg";
            movie2.UrlFullMovie = "https://sep3.blob.core.windows.net/mediacontainer/Alpha%202018.mov";

            Movie movie3 = new Movie();
            movie3.Name = "Black Panther 2018";
            movie3.MovieId = "3";
            movie3.Genre = "Adventure";
            movie3.Director = "Ryan Coogler";
            movie3.Discription = "King T'Challa returns home from America to the reclusive, technologically advanced African nation of Wakanda to serve as his country's new leader. However, T'Challa soon finds that he is challenged for the throne by factions within his own country as well as without. Using powers reserved to Wakandan kings, T'Challa assumes the Black Panther mantel to join with girlfriend Nakia, the queen-mother, his princess-kid sister, members of the Dora Milaje (the Wakandan 'special forces') and an American secret agent, to prevent Wakanda from being dragged into a world war.";
            movie3.Duration = "105 miutes";
            movie3.UrlTrailer = "https://sep3.blob.core.windows.net/mediacontainer/Black%20Panther%202018_trailer.mov";
            movie3.UrlImage = "https://sep3.blob.core.windows.net/mediacontainer/Black%20Panther%202018.jpg";
            movie3.UrlFullMovie = "https://sep3.blob.core.windows.net/mediacontainer/Black%20Panther%202018.mov";

            Movie movie4 = new Movie();
            movie4.Name = "Blindspotting 2018";
            movie4.MovieId = "4";
            movie4.Genre = "Drama";
            movie4.Director = "Carlos Lopez Estrada";
            movie4.Discription = "Collin must make it through his final three days of probation for a chance at a new beginning. He and his troublemaking childhood best friend, Miles, work as movers, and when Collin witnesses a police shooting, the two men’s friendship is tested as they grapple with identity and their changed realities in the rapidly-gentrifying neighborhood they grew up in.";
            movie4.Duration = "105 miutes";
            movie4.UrlTrailer = "https://sep3.blob.core.windows.net/mediacontainer/Blindspotting%202018_trailer.mov";
            movie4.UrlImage = "https://sep3.blob.core.windows.net/mediacontainer/Blindspotting%202018.jpg";
            movie4.UrlFullMovie = "https://sep3.blob.core.windows.net/mediacontainer/Blindspotting%202018.mov";

            Movie movie5 = new Movie();
            movie5.Name = "Christopher Robin 2018";
            movie5.MovieId = "5";
            movie5.Genre = "Comedy";
            movie5.Director = "Marc Forster";
            movie5.Discription = "Christopher Robin, now an adult focused on his life, work and family, suddenly meets his old friend Winnie the Pooh, so must embrace again his forgotten childhood to help him find the path to the Hundred Acre Wood and find out the whereabouts of his lost friends, who have mysteriously disappeared, while he is torn between the love for his family and the annoying demands of his employer who is forcing him to take harsh decisions.";
            movie5.Duration = "105 miutes";
            movie5.UrlTrailer = "https://sep3.blob.core.windows.net/mediacontainer/Christopher%20Robin%202018_trailer.mov";
            movie5.UrlImage = "https://sep3.blob.core.windows.net/mediacontainer/Christopher%20Robin%202018.jpg";
            movie5.UrlFullMovie = "https://sep3.blob.core.windows.net/mediacontainer/Christopher%20Robin%202018.mov";

            Movie movie6 = new Movie();
            movie6.Name = "Christopher Robin 2018";
            movie6.MovieId = "6";
            movie6.Genre = "Horror";
            movie6.Director = "David Gordon Green";
            movie6.Discription = "Laurie Strode comes to her final confrontation with Michael Myers, the masked figure who has haunted her since she narrowly escaped his killing spree on Halloween night four decades ago.";
            movie6.Duration = "105 miutes";
            movie6.UrlTrailer = "https://sep3.blob.core.windows.net/mediacontainer/Halloween%202018_trailer.mov";
            movie6.UrlImage = "https://sep3.blob.core.windows.net/mediacontainer/Halloween%202018.jpg";
            movie6.UrlFullMovie = "https://sep3.blob.core.windows.net/mediacontainer/Halloween%202018.mov";

            Movie movie7 = new Movie();
            movie7.Name = "Jurassic World Fallen Kingdom 2018";
            movie7.MovieId = "7";
            movie7.Genre = "Adventure";
            movie7.Director = "J. A. Bayona";
            movie7.Discription = "Three years after the demise of Jurassic World, a volcanic eruption threatens the remaining dinosaurs on the isla Nublar, so Claire Dearing, the former park manager, recruits Owen Grady to help prevent the extinction of the dinosaurs once again.";
            movie7.Duration = "105 miutes";
            movie7.UrlTrailer = "https://sep3.blob.core.windows.net/mediacontainer/Jurassic%20World%20Fallen%20Kingdom%202018.jpg";
            movie7.UrlImage = "https://sep3.blob.core.windows.net/mediacontainer/Jurassic%20World%20Fallen%20Kingdom%202018.jpg";
            movie7.UrlFullMovie = "https://sep3.blob.core.windows.net/mediacontainer/Jurassic%20World%20Fallen%20Kingdom%202018.jpg";

            Movie movie8 = new Movie();
            movie8.Name = "Mile 22 2018";
            movie8.MovieId = "8";
            movie8.Genre = "Crime";
            movie8.Director = "Peter Berg";
            movie8.Discription = "An elite group of American operatives, aided by a top-secret tactical command team, must transport an asset who holds life-threatening information to an extraction point 22 miles away through the hostile streets of an Asian city.";
            movie8.Duration = "105 miutes";
            movie8.UrlTrailer = "https://sep3.blob.core.windows.net/mediacontainer/Mile%2022%202018_trailer.mov";
            movie8.UrlImage = "https://sep3.blob.core.windows.net/mediacontainer/Mile%2022%202018.jpg";
            movie8.UrlFullMovie = "https://sep3.blob.core.windows.net/mediacontainer/Mile%2022%202018.mov";

            Movie movie9 = new Movie();
            movie9.Name = "Mission Impossible - Fallout 2018";
            movie9.MovieId = "9";
            movie9.Genre = "Action";
            movie9.Director = "Christopher McQuarrie";
            movie9.Discription = "When an IMF mission ends badly, the world is faced with dire consequences. As Ethan Hunt takes it upon himself to fulfill his original briefing, the CIA begin to question his loyalty and his motives. The IMF team find themselves in a race against time, hunted by assassins while trying to prevent a global catastrophe.";
            movie9.Duration = "105 miutes";
            movie9.UrlTrailer = "https://sep3.blob.core.windows.net/mediacontainer/Mission%20Impossible%20-%20Fallout%202018_trailer.mov";
            movie9.UrlImage = "https://sep3.blob.core.windows.net/mediacontainer/Mission%20Impossible%20-%20Fallout%202018.jpg";
            movie9.UrlFullMovie = "https://sep3.blob.core.windows.net/mediacontainer/Mission%20Impossible%20-%20Fallout%202018.mov";

            Movie movie10 = new Movie();
            movie10.Name = "Ocean's Eight 2018";
            movie10.MovieId = "10";
            movie10.Genre = "Crime";
            movie10.Director = "Gary Ross";
            movie10.Discription = "Debbie Ocean, a criminal mastermind, gathers a crew of female thieves to pull off the heist of the century at New York's annual Met Gala.";
            movie10.Duration = "105 miutes";
            movie10.UrlTrailer = "https://sep3.blob.core.windows.net/mediacontainer/Ocean's%20Eight%202018_trailer.mov";
            movie10.UrlImage = "https://sep3.blob.core.windows.net/mediacontainer/Ocean's%20Eight%202018.jpg";
            movie10.UrlFullMovie = "https://sep3.blob.core.windows.net/mediacontainer/Ocean's%20Eight%202018.mov";

            Movie movie11 = new Movie();
            movie11.Name = "San Andreas 2015";
            movie11.MovieId = "11";
            movie11.Genre = "Action";
            movie11.Director = "Brad Peyton";
            movie11.Discription = "In the aftermath of a massive earthquake in California, a rescue-chopper pilot makes a dangerous journey across the state in order to rescue his estranged daughter.";
            movie11.Duration = "105 miutes";
            movie11.UrlTrailer = "https://sep3.blob.core.windows.net/mediacontainer/San%20Andreas%202015_trailer.mov";
            movie11.UrlImage = "https://sep3.blob.core.windows.net/mediacontainer/San%20Andreas%202015.jpg";
            movie11.UrlFullMovie = "https://sep3.blob.core.windows.net/mediacontainer/San%20Andreas%202015.mov";

            Movie movie12 = new Movie();
            movie12.Name = "Skyscraper 2018";
            movie12.MovieId = "12";
            movie12.Genre = "Action";
            movie12.Director = "Rawson Marshall Thurber";
            movie12.Discription = "Framed and on the run, a former FBI agent must save his family from a blazing fire in the world's tallest building.";
            movie12.Duration = "105 miutes";
            movie12.UrlTrailer = "https://sep3.blob.core.windows.net/mediacontainer/Skyscraper%202018_trailer.mov";
            movie12.UrlImage = "https://sep3.blob.core.windows.net/mediacontainer/Skyscraper%202018.jpg";
            movie12.UrlFullMovie = "https://sep3.blob.core.windows.net/mediacontainer/Skyscraper%202018.mov";

            Movie movie13 = new Movie();
            movie13.Name = "Smallfoot 2018";
            movie13.MovieId = "13";
            movie13.Genre = "Comedy";
            movie13.Director = "Jason Reisig ";
            movie13.Discription = "A bright young yeti finds something he thought didn't exist—a human. News of this “smallfoot” throws the simple yeti community into an uproar over what else might be out there in the big world beyond their snowy village.";
            movie13.Duration = "105 miutes";
            movie13.UrlTrailer = "https://sep3.blob.core.windows.net/mediacontainer/Smallfoot%202018_trailer.mov";
            movie13.UrlImage = "https://sep3.blob.core.windows.net/mediacontainer/Smallfoot%202018.jpg";
            movie13.UrlFullMovie = "https://sep3.blob.core.windows.net/mediacontainer/Smallfoot%202018.mov";

            Movie movie14 = new Movie();
            movie14.Name = "The Equalizer 2 2018";
            movie14.MovieId = "14";
            movie14.Genre = "Crime";
            movie14.Director = "Antoine Fuqua";
            movie14.Discription = "Robert McCall, who serves an unflinching justice for the exploited and oppressed, embarks on a relentless, globe-trotting quest for vengeance when a long-time girl friend is murdered.";
            movie14.Duration = "105 miutes";
            movie14.UrlTrailer = "https://sep3.blob.core.windows.net/mediacontainer/The%20Equalizer%202%202018_trailer.mov";
            movie14.UrlImage = "https://sep3.blob.core.windows.net/mediacontainer/The%20Equalizer%202%202018.jpg";
            movie14.UrlFullMovie = "https://sep3.blob.core.windows.net/mediacontainer/The%20Equalizer%202%202018.mov";

            Movie movie15 = new Movie();
            movie15.Name = "The Predator 2018";
            movie15.MovieId = "15";
            movie15.Genre = "Adventure";
            movie15.Director = "Shane Black";
            movie15.Discription = "From the outer reaches of space to the small-town streets of suburbia, the hunt comes home. Now, the universe’s most lethal hunters are stronger, smarter and deadlier than ever before, having genetically upgraded themselves with DNA from other species. When a young boy accidentally triggers their return to Earth, only a ragtag crew of ex-soldiers and a disgruntled science teacher can prevent the end of the human race.";
            movie15.Duration = "105 miutes";
            movie15.UrlTrailer = "https://sep3.blob.core.windows.net/mediacontainer/The%20Predator%202018_trailer.mov";
            movie15.UrlImage = "https://sep3.blob.core.windows.net/mediacontainer/The%20Predator%202018.jpg";
            movie15.UrlFullMovie = "https://sep3.blob.core.windows.net/mediacontainer/The%20Predator%202018.mov";

            Movie movie16 = new Movie();
            movie16.Name = "The Shape of Water 2017";
            movie16.MovieId = "16";
            movie16.Genre = "Drama";
            movie16.Director = "Guillermo del Toro";
            movie16.Discription = "An other-worldly story, set against the backdrop of Cold War era America circa 1962, where a mute janitor working at a lab falls in love with an amphibious man being held captive there and devises a plan to help him escape.";
            movie16.Duration = "105 miutes";
            movie16.UrlTrailer = "https://sep3.blob.core.windows.net/mediacontainer/The%20Shape%20of%20Water%202017.mov";
            movie16.UrlImage = "https://sep3.blob.core.windows.net/mediacontainer/The%20Shape%20of%20Water%202017.jpg";
            movie16.UrlFullMovie = "https://sep3.blob.core.windows.net/mediacontainer/The%20Shape%20of%20Water%202017.mov";

            Movie movie17 = new Movie();
            movie17.Name = "Venom 2018";
            movie17.MovieId = "17";
            movie17.Genre = "Horror";
            movie17.Director = "Ruben Fleischer";
            movie17.Discription = "Investigative journalist Eddie Brock attempts a comeback following a scandal, but accidentally becomes the host of an alien symbiote that gives him a violent super alter-ego: Venom. Soon, he must rely on his newfound powers to protect the world from a shadowy organisation looking for a symbiote of their own.";
            movie17.Duration = "105 miutes";
            movie17.UrlTrailer = "https://sep3.blob.core.windows.net/mediacontainer/Venom%202018_trailer.mov";
            movie17.UrlImage = "https://sep3.blob.core.windows.net/mediacontainer/Venom%202018.jpg";
            movie17.UrlFullMovie = "https://sep3.blob.core.windows.net/mediacontainer/Venom%202018.mov";


            MovieList.movies.Add(movie1);
            MovieList.movies.Add(movie2);
            MovieList.movies.Add(movie3);
            MovieList.movies.Add(movie4);
            MovieList.movies.Add(movie5);
            MovieList.movies.Add(movie6);
            MovieList.movies.Add(movie7);
            MovieList.movies.Add(movie8);
            MovieList.movies.Add(movie9);
            MovieList.movies.Add(movie10);
            MovieList.movies.Add(movie11);
            MovieList.movies.Add(movie12);
            MovieList.movies.Add(movie13);
            MovieList.movies.Add(movie14);
            MovieList.movies.Add(movie15);
            MovieList.movies.Add(movie16);
            MovieList.movies.Add(movie17);

            foreach (Movie m in MovieList.movies)
            {
                //if (m.Genre == "Action") { 
                MoviePanel moviePanel = new MoviePanel();

                moviePanel.Title = m.Name;
                moviePanel.Link = m.UrlFullMovie;
                moviePanel.Image = m.UrlImage;
                moviePanel.Height = 230;
                moviePanel.Width = 150;
                flowLayoutPanel1.Controls.Add(moviePanel);
               // }
            }
        }

        private void Movies_Load(object sender, EventArgs e)
        {
            worker.DoWork += worker_doWork;
            worker.RunWorkerAsync();
        }
    }
}
