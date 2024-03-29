package com.team7trek.trekDemo;
import com.team7trek.trekDemo.models.Continent;
import com.team7trek.trekDemo.models.Region;
import com.team7trek.trekDemo.models.Trek;
import com.team7trek.trekDemo.repositories.ContinentRepository;
import com.team7trek.trekDemo.repositories.RegionRepository;
import com.team7trek.trekDemo.repositories.TrekRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import javax.annotation.Resource;

@Component
public class Populator implements CommandLineRunner {
    @Resource
    private TrekRepository trekRepo;
    @Resource
    private ContinentRepository continentRepo;
    @Resource
    private RegionRepository regionRepo;
    @Override
    public void run(String... args) throws Exception {
        Continent northAmerica = new Continent("North America","/images/na.jpg");
        Continent southAmerica = new Continent("South America","/images/sa2.jpg");
        Continent europe = new Continent("Europe","/images/eu1.jpg");
        Continent asia = new Continent("Asia","/images/asia.jpg");
        Continent antarctica = new Continent("Antarctica","/images/snow2.jpg");
        Continent africa = new Continent("Africa","/images/africa.jpg");
        Continent australia = new Continent("Australia","/images/peace.jpg");
        continentRepo.save(northAmerica);
        continentRepo.save(southAmerica);
        continentRepo.save(europe);
        continentRepo.save(asia);
        continentRepo.save(antarctica);
        continentRepo.save(africa);
        continentRepo.save(australia);
        Region northAmerica1 = new Region("Great Plains ", " Tropical hot", "/images/na2.jpg", northAmerica);
        Region northAmerica2 = new Region("Canadian Shield", " Cold zone","/images/trees.jpg", northAmerica);
        Region southAmerica2 = new Region("Gran Chaco", " wet and humid", "/images/CopperCanyon.jpg", southAmerica);
        Region southAmerica1 = new Region("Amazon basin", " Mediterranean", "/images/sa1.jpg", southAmerica);
        Region europe1 = new Region("Denmark", "marine west coast", "/images/eu2.jpg", europe);
        Region europe2 = new Region("Sweden", " humid continental", "/images/eu1.jpg", europe);
        Region asia1 = new Region("West Asia", "Savanna", "/images/asia.jpg", asia);
        Region asia2 = new Region("South Asia", "Tropical ", "/images/asia1.jpg", asia);
        Region antarctica1 = new Region("South Orkney Islands", "arctic", "/images/snow.jpg", antarctica);
        Region antarctica2 = new Region("East Antarctica", "subtropical", "/images/snow.jpg", antarctica);
        Region africa1 = new Region("West Africa", "wet tropical", "/images/africa1.jpg", africa);
        Region africa2 = new Region("East Africa", "Saharan", "/images/africa.jpg", africa);
        Region australia1 = new Region("Tasmania", "warm winter", "/images/desert.jpg", australia);
        Region australia2 = new Region("Queensland", "Hot humid summer", "/images/desert1.jpg", australia);
        regionRepo.save(northAmerica1);
        regionRepo.save(northAmerica2);
        regionRepo.save(southAmerica1);
        regionRepo.save(southAmerica2);
        regionRepo.save(europe1);
        regionRepo.save(europe2);
        regionRepo.save(asia1);
        regionRepo.save(asia2);
        regionRepo.save(antarctica1);
        regionRepo.save(antarctica2);
        regionRepo.save(africa1);
        regionRepo.save(africa2);
        regionRepo.save(australia1);
        regionRepo.save(australia2);
        Trek na1 = new Trek("Killer Kayaking","2/5","Just north of Vancouver Island, BC hundreds of orca (killer) whales migrate.Telegraph Cove is a world renowned place for kayaking with the whales.","Exhilarating and terrifying. There is something amazing about watching these huge masters of the ocean, but to be near them is to remind you how small a part of the world you are.","/images/killerkayaking.jpg",northAmerica,northAmerica1);
        Trek na2 = new Trek("Waterfall Repelling","4/5","Waterfall repelling or canyoning is one of Costa Rica's most thrilling adventure sports. This TREK involves a romp through a beautiful rainforest and a descent into crystalline water that will satisify even the biggest adrenaline junkies and leave you begging to do it all over again.","Amazing once in a lifetime views and experiences. Challenging but worth it in the end.","/images/costarica.jpg",northAmerica,northAmerica1);
        Trek na3 = new Trek("Copper Canyon","3/5","The longest (3km), highest (300 meters) and fastest (120 km per hour) zipline in the world is in the Copper Canyon Adventure Park (Parque de Aventuras) near Divisadero. This is part of a system of seven ziplines and two suspension bridges. Other optional activities at the park include a trip in a cable car and a Via Ferrata that allows you to scale and rappel the wall of the canyon. Enjoy the beauty of the canyon and get an adrenaline rush at the same time!","The most wonderful and enchanted places you will ever visit! The people, views and food are awesome. Its a place difficult to get too, but well worth it.","/images/CopperCanyon.jpg",northAmerica,northAmerica2);
        Trek na4 = new Trek("Mr.Toads Wild Ride","5/5","You may think this is a Disney ride by the name but you would be gravely mistaken. Mr.Toads Wild Ride is a single-track mountain bike route that is mostly downhill from Tahoe Rim Trail, Lake Tahoe. The total descent is over 2000 ft. The path itself is not for the faint of heart with steep drops, sections of nothing but rock, and large jumps.","Amazing, definitely recommend but be forewarned this is not for beginners. I have years of offroad biking experience and there were several parts in the trail with between the speed and obstacle I was certain I was about to crash.","/images/laketahoe.jpg",northAmerica,northAmerica2);
        Trek sa1 = new Trek("Diving With Hammerhead Sharks in the Galapagos","5/5","The distinctive face of the hammerhead shark is one of the great wonders of nature, and in the waters around the Galapagos Islands, there are some of the best diving spots for encounters with these majestic marine animals anywhere in the world.","Being surrounded by hundreds of these sharks is terrifying and exciting.","/images/killerkayaking.jpg",southAmerica,southAmerica1);
        Trek sa2 =new Trek("Infamous Death Road","5/5","One of the most surprising attractions in Bolivia is also one of its most notorious, with the cliff side road once being hailed as the most dangerous road in the world. It is now one of the most exciting mountain biking routes in the region. We were 4 people with mountain bike experience varying from beginner to advanced. Our guides were very accommodating and helpful. I never felt in danger!","review","image",southAmerica,southAmerica1);
        Trek sa3 = new Trek("Chile's Rio Futaleufu","3/5","Believed to be one of the best whitewater rafting rivers in the world, the Rio Futaleufu is a stunning river flowing through the Andes, and featuring some dramatic Grade III, IV and V rapids that will challenge even experienced rafters.","One of the most beautiful, pristine places we have ever been. It's a bit of a commitment to get there, so if you can, allow extra days because there is plenty to see and do. We were a bit nervous about class 4 and 5 rapids, but WOW! what a thrill!","image",southAmerica,southAmerica2);
        Trek sa4 = new Trek("Atacama Desert, Chile","4/5","he world's driest desert is only a short distance outside the town of San Pedro de Atacama. There are seemingly endless sand dunes north of town where you can try this variant of surfing, and see how you cut the slopes up with your moves. ","We absolutely loved our sandboarding experience, the lesson at the start was good and then you were given advice on how to improve every time you came back up. If you are willing to you can make so much out of this by making sure you head straight back up the dune every time.","image",southAmerica,southAmerica2);
        Trek e1 = new Trek("Zip Line, Snowdonia","2/5","Set in North Wales near the stunning Snowdon range, in what once was the world’s largest slate quarry, Penrhyn Quarry is now home to the fastest zip line in the world, 100mph, where you can fly 500m above the bright blue quarry lake.","We did the zipline and it was absolutely amazing. The staff was friendly and helpful from beginning to the end. Everything went smoothly, without any delays; the activity started right at the time we booked, and ended 2 hours later as advertised. We were super lucky, as the weather was clear and sunny. ","image",europe,europe1);
        Trek e2 = new Trek("Running with the Bulls","5/5","You’ve heard of running with the bulls in Pamplona,then run through the streets of the city with dozens of aggressive bulls nicking at your heels. We do warn you, though, injuries are common, so make sure this is one of those adrenaline activities you want to attempt.","The tour was a terrific experience. I would not have seen everything they showed me on my own.","image",europe,europe1);
        Trek e3 = new Trek("Rally Driving, Knockhill","4/5","Petrol heads, this is your calling. If you ever wanted to learn how to be a proper rally driver, give this a try. In two-and-a-half hours, you will have a driving lesson with a professional. Then you’ll take the wheel.","Had an absolutely fantastic day in the new fiesta st s. Great instruction  will definitely be back soon.","image",europe,europe2);
        Trek e4 = new Trek("Hang Gliding Sierra Nevada Spain","3/5","Hang gliding is one of the best adrenaline activities available, but we warn you: try it once and you might become obsessed. Experience Sierra Nevada National Park from the sky with a tandem paragliding flight from Granada. This is an incredible experience that you will never forget!","Amazing experience and some of the most incredible scenery in the world.","image",europe,europe2);
        Trek af1 = new Trek("Rhino Tracking ","4/5","Seeing a rhino on foot and in the wild is on more and more traveler’s bucket lists. Damaraland’s eco-camp, Desert Rhino Camp in north-west Namibia, offers rhino tracking in an area that boasts the largest free-roaming black rhino population in Africa.","This expedition is not for the faint hearted! we have been bumping around for hours and hours but the result is amazing. On our way back we saw Giraffes, Zebra's and Lions! ","image",asia,asia1);
        Trek af2 = new Trek("Walk With Lions","2/5","No 1 on every first-time safari goer’s list of things to see has to be the King of the Beasts – The African Lion. Can you imagine the thrill of actually walking alongside a pride of lions? This experience has been added to the many experiences on offer at Victoria Falls. ","Walking with lions in the bushes was amazing. Truly an unforgettable experience. The staff walks with you to ensure you have a great experience and ensure your safety. Not once did I feel unsafe.","image",asia,asia1);
        Trek af3 = new Trek("White Water Rafting on the Zambezi River","4/5","The mighty Zambezi River plummets over the Victoria Falls where there are dramatic views big rapid riders will love the white water action below the Falls as well as the high-speed boat trips. Accessed from either the Zimbabwe or Zambian side","Rafting was amazing and the views were sensational. No amount of sunscreen is enough. The walk down to the river was challenging and the walk out was arduous, steep terrain after a day rafting in the sun. ","image",asia,asia2);
        Trek af4 = new Trek("Shark Cage Diving","4/5","Though South Africa’s Cape is known for its Jackass Penguins and huge seal populations, something a little more sinister lurks beneath the rough seas that divide the two great Oceans of the South Atlantic and the Indian Ocean; The Great White Shark.","If the ocean’s apex predator is on your South Africa bucket list, look no further. Come face to face with great white and/or copper sharks in Gansbaai’s cool ocean waters—or watch from the specially designed catamaran","image",asia,asia2);
        Trek ant1 = new Trek("Volcanic Bath","1/5","At Deception Island, tourists can see a former whaling station—complete with abandoned boilers, rusted boats, and decomposing whale bones—located on an active volcano. As you take a thermal bath in one of the island’s natural hot springs, you’ll probably spot several chinstrap penguins.","It has a delightfully protected harbour in an old volcano crater. The steam rises from the black volcanic sands of the beach and if you scratch below the surface the hot water wells up from underneath.","image",antarctica,antarctica1);
        Trek ant2 = new Trek("The Drake Passage","5/5","As the shortest route by ship to and from Antarctica, the Drake Passage is the body of water between Antarctica and the southernmost part of South America. Known for its danger and unpredictability, the Drake Passage can be extremely turbulent due to its bottleneck position between the Pacific, Southern, and Atlantic Oceans. ","Be prepared for the worst, but don’t psych yourself out. Literally go with the flow and keep your eye on the prize — and the horizon — because regardless of how rough the passage, Antarctica is the ultimate reward.","image",antarctica,antarctica1);
        Trek ant3 = new Trek("Glacier Climbing","5/5","If you have a zero fear of heights, you must add climbing activities to your to-do list while in Antarctica. To enjoy the majestic views from the top of a mountain","Once in Antarctica it was breathtaking! There are no words that can describe this experience.","image",antarctica,antarctica2);
        Trek ant4 = new Trek("Under the ice diving","4/5","To dive in the chill waters of below 4 degree Celsius and explore the astonishing beauty of the White continent is an opportunity that no deep-sea diver would want to miss. he vibrant colors of the coral reefs, swimming penguins, icebergs, and beautiful creatures creates a perfect underwater scene.","Antarctica was everything we hoped it would be and more. We were able to go diving, kayaking, overnight camping and walking as well as doing an ocean plunge. There were so many fantastic experiences.","image",antarctica,antarctica2);
        Trek a1 = new Trek("Mount Hua Hike","5/5","If you don’t think of hiking as an extreme sport, you might reconsider after attempting the world’s most dangerous hiking trail to the peak of Huashan. Steep, narrow staircases carved into the mountain bordered by equally steep drops on either side are the easiest parts of the climb. Near-vertical ‘sky ladders’ require hikers to pull themselves up using chains. To reach the highest peak, adventurers must traverse the infamous ‘Plank Road’, a 60-centimetre wide path consisting of rickety planks nailed into a sheer mountain face — a thousand metres above the ground. And all this while dodging those pesky sprinters trying to overtake you.","Arrived early to get one of the first buses to the entrance. Then climbed a million and one stairs to get to the plank walk.","image",africa,africa1);
        Trek a2 = new Trek("Mount Everest, Nepal Skydive","4/5","try falling from 7,010 metres (23,000 feet) in the adventure that beats all other adventures: skydiving through the Himalayan skies. Standing with our feet securely on the ground and looking up, this seems like an incomprehensible height. In fact, it’s so high that you’ll need oxygen masks just to reach that altitude.","There are some moments in life that define the fabric of one's existence. For me, one such moment was that very instant when I leaped out of the helicopter into what seemed to me was nothingness, absolute nothingness!","image",africa,africa1);
        Trek a3 = new Trek("Impossible River Rafting","5/5","Dubbed the “Everest of Rivers”, the 238-kilometre Maykha River winds through untouched forests, towering granite gorges, and huge rapids in the far north of Myanmar. ","Some of the most difficult rafting on the planet, combine that with the near impossible task of actually getting to the launch and its a once in a lifetime experience that only the sturdiest of adventures should undertake.","image",africa,africa2);
        Trek a4 = new Trek("Kitesurfing in Boracay","2/5","Every year, kiters from all over the globe flock to a tiny island in the Philippines to enjoy epic wind and water conditions for kitesurfing. With consistent wind and year round warm waters, Boracay Island is a great spot to learn the sport.","Boracay is a beautiful little island. It was our second time there. The first time, we didnt know about Bolabog beach and the kitesurfing activity. But this time we didn’t miss out. Bolabog is a beautiful lagoon. Learning kitesurfing there was perfect as it was shallow.","image",africa,africa2);
        Trek aus1 = new Trek("4wd on Fraser Island","1/5","Fraser Island, off the coast of Southeast Queensland, offers one of the most unique 4WD adventures in Australia. Cruising down 75 Mile Beach, a seemingly endless stretch of wave-thrashed shore on the planet's largest sand island, is an exhilarating experience. This is also a fun family adventure holiday.","There is challenging sand tracks and heaps of Beach driving. The introduction to driving safely on the island was, however, very good and also the itinaries of where to go when. We felt confident driving by ourselves and had a great day enjoying the amazing nature.","image",australia,australia1);
        Trek aus2 = new Trek("Great Barrier Reef","3/5","Australia is not only packed with exhilarating adventures on land-you can also explore the largest coral reef system on the planet. Comprised of more than 2,900 separate reefs, this World Heritage-listed jewel in the Aussie state of Queensland is one of Australia's top tourist attractions and a bucket-list adventure for travelers.","Awesome day out on the reef! Snorkelled the reef and saw turtles, relax on the island highly recommended for anyone's bucket list","image",australia,australia1);
        Trek aus3 = new Trek("Kayak Katherine Gorge","2/5","Flowing through a series of steep-walled, red rock gorges, the Katherine River in Nitmiluk National Park offers the ultimate outback kayaking adventure. Cliffs rise up to 100 meters on either side of the river as you paddle through pandanus-fringed pools, past paperbark forests, and over gentle rapids. Kayaking the river allows you to go beyond the first few gorges","I highly recommend it, its the perfect way to get close to nature and truly appreciate the beautiful surroundings. It does require some muscle, paddling upstream on the way back up the gorge, so I recommend it for people who are confident around water.","image",australia,australia2);
        Trek aus4 = new Trek("Zorbing","1/5","If you are not so much into adventure sports but still want to try some in order to have some thrilling experience, then try zorbing while in Australia. You will simply have to get into a giant ball of hamster and roll down the hill. It might look easy but it is not and is equally exciting.","What an amazing experience! I still think the concept is incredibly strange but such a fun experience and not as scary as I thought it was when I was teetering on the edge of the hill. Great idea to have the hot spa and the go pro too. We will definitely be back!","image",australia,australia2);
        trekRepo.save(na1);
        trekRepo.save(na2);
        trekRepo.save(na3);
        trekRepo.save(na4);
        trekRepo.save(sa1);
        trekRepo.save(sa2);
        trekRepo.save(sa3);
        trekRepo.save(sa4);
        trekRepo.save(e1);
        trekRepo.save(e2);
        trekRepo.save(e3);
        trekRepo.save(e4);
        trekRepo.save(a1);
        trekRepo.save(a2);
        trekRepo.save(a3);
        trekRepo.save(a4);
        trekRepo.save(ant1);
        trekRepo.save(ant2);
        trekRepo.save(ant2);
        trekRepo.save(ant3);
        trekRepo.save(ant4);
        trekRepo.save(af1);
        trekRepo.save(af2);
        trekRepo.save(af3);
        trekRepo.save(af4);
        trekRepo.save(aus1);
        trekRepo.save(aus2);
        trekRepo.save(aus3);
        trekRepo.save(aus4);
    }
}