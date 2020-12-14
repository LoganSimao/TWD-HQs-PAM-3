package br.sp.senac.projetorecyclerviewapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<TWD> lstTimes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Inserindo os livros no arrayList vazio
        lstTimes = new ArrayList<>();
        lstTimes.add(new TWD("Volume 1: Days Gone Bye","This volume begins the story of Rick Grimes, a sheriff's deputy from Kentucky, who is wounded in action and emerges from a coma to find the world plagued by the undead. Upon returning home, he finds his house ransacked and his wife and son gone. Rick travels to a military evacuation zone in Atlanta to find his family and joins a small group of survivors along the way, all the while trying to adapt to life in this new world.","1",R.drawable.vol1));
        lstTimes.add(new TWD("Volume 2: Miles Behind Us","This volume picks up after the events of Volume 1: Days Gone Bye. After the death of Shane, Rick Grimes and the rest of the survivors leave Atlanta and travel across many miles of hostile territory seeking a safer home. The group picks up new members and loses old ones as they attempt to survive the brutal winter. The group eventually finds shelter at a small farm, though it is discovered that Hershel Greene, the owner of the farm, and his family are keeping a dark secret.","2",R.drawable.vol2));
        lstTimes.add(new TWD("Volume 3: Safety Behind Bars", "After being forced to leave the farm, Rick's group stumbles upon what seems to be a permanent sanctuary, an abandoned prison. Soon after clearing one cell block and settling in, the survivors learn that they are not the only residents of this prison and realize for the first time that the greatest threat to their survival in this new world may not be the dead, but the living", "3", R.drawable.vol3));
        lstTimes.add(new TWD("Volume 4: The Heart's Desire", "The group manages to quell Dexter's rebellion and further secure the prison. At the same time, a katana-wielding woman named Michonne arrives at the prison seeking refuge. Her arrival leads to a major schism within the group, and Rick's role as leader is questioned as the others start to fear for his sanity. The volume ends with one simple proclamation that will forever change the survivors of The Walking Dead.", "4", R.drawable.vol4));
        lstTimes.add(new TWD("Volume 5: The Best Defense", "After the dramatic events of the last volume, Rick, Glenn, and Michonne leave the prison after spotting their first sign of other survivors. Their search brings them to a small town called Woodbury where a large, well-armed and well-organized group of survivors have taken refuge, led by a man called The Governor. Rick and his comrades quickly learn, at terrible cost to themselves, that they have fallen into the hands of the most dangerous group of people they could have imagined.", "5", R.drawable.vol5));
        lstTimes.add(new TWD("Volume 6: This Sorrowful Lifer", "In this volume Rick, Glenn, and Michonne manage to escape from Woodbury with the help of some others wishing to be free from The Governor's insane rule. They manage to safely arrive back at the prison, but they are completely unprepared for what they have found.", "6", R.drawable.vol6));
        lstTimes.add(new TWD("Volume 7: The Calm Before", "The group attempts to settle down again after their nightmarish experiences at Woodbury. Relationships among the survivors at the prison continue to grow as Lori enters the last stages of her pregnancy. All the while, the group tries to prepare themselves for the sure revenge of The Governor and his town of psychotic survivors.", "7", R.drawable.vol7));
        lstTimes.add(new TWD("Volume 8: Made To Suffer", "The Governor has finally found the prison and attacks with amazing force. The group is torn over what action to take. While many choose to stay, others leave to fend for themselves. As the body counts rises and more and more damage is done to both sides, things will literally never be the same again for Rick Grimes and his fellow survivors.", "8", R.drawable.vol8));
        lstTimes.add(new TWD("Volume 9: Here We Remain","After the prison is destroyed and the group is scattered, Rick and Carl attempt to find shelter in a nearby town and reunite with surviving members of the group. Rick's physical and mental state begin to unravel, while Carl starts to grow more independent and apathetic. They eventually manage to reunite with the other survivors, however, before they can recover fully, three new survivors arrive and present an unbelievable opportunity for the group if they join them.","9",R.drawable.vol9));
        lstTimes.add(new TWD("Volume 10: What We Become","This volume takes place as the group is on the road making its way to Washington, D.C. with a scientist, Eugene Porter, who can apparently end the outbreak. Rick is immediately at odds with Abraham over their methods on how to lead. With Carl in tow, the three travel to Rick's hometown for any supplies left at Rick's police station and come across an old friend in the process. Along the way, Rick finally sees just how far he is willing to go to protect the family he has left.","10",R.drawable.vol10));
        lstTimes.add(new TWD("Volume 11: Fear The Hunters", "While Rick Grimes and the Survivors continue on their way to Washington, D.C., they start to suspect they are being stalked by someone in the woods. Suddenly, Dale is kidnapped in the night and Rick, Abraham, Michonne, and Andrea set out to find this new threat and stop them. But, these survivors may finally see their humanity torn to the last shred with the actions they take to protect their own.", "11", R.drawable.vol11));
        lstTimes.add(new TWD("Volume 12: Life Among Them", "In Volume 12, Rick Grimes and his group run across a seemingly trustworthy man named Aaron who escorts them to a large, walled-off community of suvivors called the Alexandria Safe-Zone led by a man named Douglas Monroe. It is a welcomed change for the weary survivors, but, they soon suspect that it may be too good to be true.", "12", R.drawable.vol12));
        lstTimes.add(new TWD("Volume 13: Too Far Gone", "The members of Rick's group settle into their new roles in the Alexandria Safe-Zone, and Rick, as constable, tries to make the place safer by stopping a dangerous man inside the community. But, could Rick and his battle-scarred compatriots be too far gone to live a peaceful life again?", "13", R.drawable.vol13));
        lstTimes.add(new TWD("Volume 14: No Way Out", "After the murder of Douglas' wife, Rick and his people begin to step up as the leaders of the Alexandria community against the wishes of many residents. But, the people of Alexandria have a much bigger problem that they must deal with together when they discover they are surrounded by a massive herd of roamers.", "14", R.drawable.vol14));
        lstTimes.add(new TWD("Volume 15: We Find Ourselves", "As the Alexandria Safe-Zone finds itself recuperating from the herd attack, Rick begins making decisions that will lead to the long term sustainability of their community. Carl is still unconscious from his injury and it is unclear whether he will survive. Some people also question the bold choices Rick has made for the community and try to take over Alexandria.", "15", R.drawable.vol15));
        lstTimes.add(new TWD("Volume 16: A Larger World", "In this arc, Rick is hoping to restart a civilized and peaceful life inside the Alexandria Safe-Zone, but, his group realizes they're not the only survivors out in the world. They encounter a new survivor in the wastes named Paul Monroe, who says he is a recruiter for a group of possibly more than 200 people nearby called the Hilltop Colony. The colony appears to be even safer than Alexandria, but the group soon learns that the people of the Hilltop Colony have some very dangerous enemies.", "16", R.drawable.vol16));
        lstTimes.add(new TWD("Volume 17: Something To Fears", "Rick and his group confront the Hilltop Colony's enemy, The Saviors, a group of brutal people led by a man named Negan. However, Rick severely underestimates The Saviors and does not take them seriously as something to be feared until some of his best friends begin dying in brutally savage ways. In the end, Rick is forced into an ultimatum that puts the lives of everyone in Alexandria on the line", "17", R.drawable.vol17));
        lstTimes.add(new TWD("Volume 18: What Comes After", "While the Survivors learns what living under Negan's rules really mean, Rick devises a new strategy to deal with the Saviors. But, before it can be put in motion, a member of the group disappears after the Saviors collect their payment from Alexandria. Rick and Jesus must now call on the help of an exotic man named Ezekiel and his 'kingdom' of survivors to have any chance of defeating the Saviors.", "18", R.drawable.vol18));
        lstTimes.add(new TWD("Volume 19: March To War", "Rick, Jesus, and Ezekiel decide to trust Dwight and move forward with their attempt to end the Saviors' reign. The three communities come together to formulate a plan, but, when Negan shows up early to collect his offering from Alexandria, things get very out of hand.", "19", R.drawable.vol19));
        lstTimes.add(new TWD("Volume 20: All Out War - Part One", "In this volume, Rick leads his newly formed 'army' with the Hilltop and the Kingdom in an attack against the Sanctuary. Things go smoothly at first as Rick's forces manage to trap Negan inside the Sanctuary, but as they attack Negan's outposts many of Rick's closest friends begin dying and they wonder if their initial victory was just luck. Eventually, Negan mounts a counter attack on Alexandria and things go from bad to worse.", "20", R.drawable.vol20));
        //declarando a variavel xml enviando para o java
        RecyclerView mRecyclerView = findViewById(R.id.id_recyclerView);

        //Instânciando o adaptador com os valores necessários
        RecyclerViewAdapter mAdapter = new RecyclerViewAdapter(getApplicationContext(), lstTimes);
        //Criando o layout para inserção dos valores

        //LayoutManager não é necessário inserção de colunas - pode ser utilizado na vertical ou horizontal
       // mRecyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext(), RecyclerView.HORIZONTAL,true));

        //GriLayoutManager necessário a inserção de colunas
        mRecyclerView.setLayoutManager(new GridLayoutManager(getApplicationContext(), 3));

        //Para melhorar a performance do RecyclerView na listagem
        mRecyclerView.setHasFixedSize(true);

        //Inserindo os valores na lista do RecyclerView
        mRecyclerView.setAdapter(mAdapter);
    }
}
