package org.adrianfdev.application;

import org.adrianfdev.model.ReviewRepository;

public class ShopBenchApplication {

    public static void main(String[] args) {

        String review = """
                The respiratory system (also respiratory apparatus, ventilatory system)
                is a biological system consisting of specific organs and structures 
                used for gas exchange in animals and plants. The anatomy and physiology
                that make this happen varies greatly, depending on the size of the organism,
                the environment in which it lives and its evolutionary history. 
                In land animals the respiratory surface is internalized as linings 
                of the lungs.[1] Gas exchange in the lungs occurs in millions of small 
                air sacs; in mammals and reptiles these are called alveoli, and in birds 
                they are known as atria. These microscopic air sacs have a very rich blood supply,
                thus bringing the air into close contact with the blood.[2] These air sacs 
                communicate with the external environment via a system of airways, or hollow tubes,
                of which the largest is the trachea, which branches in the middle of the chest
                into the two main bronchi. These enter the lungs where they branch into
                progressively narrower secondary and tertiary bronchi that branch into numerous
                smaller tubes, the bronchioles. In birds the bronchioles are termed parabronchi.
                It is the bronchioles, or parabronchi that generally open into the microscopic
                alveoli in mammals and atria in birds. Air has to be pumped from the environment
                into the alveoli or atria by the process of breathing which involves the muscles
                of respiration.""";

        ReviewRepository rp = new ReviewRepository();
        String updatedText = rp.abbreviateText(review,300);
        System.out.println(updatedText);

    }
}
