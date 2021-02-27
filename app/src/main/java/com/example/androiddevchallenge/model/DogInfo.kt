package com.example.androiddevchallenge.model

import androidx.annotation.DrawableRes
import com.example.androiddevchallenge.R

typealias DogInfoId = Int

data class DogInfo(
    val id: DogInfoId = nextIndex++,
    val name: String,
    @DrawableRes val image: Int,
    val description: String,
) {
    companion object {
        private var nextIndex = 0

        val mocks = listOf(
            DogInfo(
                name = "Tina",
                image = R.drawable.ic_tina,
                description = """
Little Tina wants to go home)

Age 2.5 months
Very gentle, playful, funny
It will grow small.

Healthy, treated against parasites.
Gets along very well with cats and other dogs.
        """
            ),
            DogInfo(
                name = "Bruno",
                image = R.drawable.ic_bruno,
                description = """
Boy Bruno, little 2 months.
Cute and shy child.
Loves attention and games.
Vaccinated, healthy.
Come to meet.
        """
            ),
            DogInfo(
                name = "Hasandra",
                image = R.drawable.ic_hasandra,
                description = """
Beauty Hasandra is looking for a family 😍

Metis Husky with different eyes, sterilized, about 2 years old ❤️

She saved her children from certain death and now we will save her ... we found her with a wound in her throat .. I don’t even want to think about where she came from 😭

It's very hard on the street ... especially for such an affectionate girl ...

She is really looking forward to her family ❤️
        """
            ),
            DogInfo(
                name = "Forbes",
                image = R.drawable.ic_forbes,
                description = """
Even a cool nickname does not save you from being unnecessary 😒

Yes, yes, now we are talking about our ward Forbes. A healthy, handsome guy, who is already a year old, continues to look for a family. We just do not understand why among people, brunettes are in trend, but among dogs, those same brunettes remain invisible?

We saved Forbes as a puppy from a crazy granny who didn't want to give him to us. The kid was sick and we fought for his life. Fortunately, we succeeded. From only one thing we are sad - he is still homeless.

Ears-crumbs, eyes - two beads, a wet nose, as befits a dog and a devoted gaze, is it really not enough for people to notice him?

Help us break stereotypes and tell the world that brunet dogs also want to be pet and loved. We really need reposts to find a home for this handsome man.

Forbes is castrated, vaccinated, but a little timid and needs to be approached. But if you show him your care and love, then he will give you the same, only several times more. 😌
        """
            ),
            DogInfo(
                name = "Chiba",
                image = R.drawable.ic_chiba,
                description = """
Chiba arrived at the gas station on the road, where she had been lying for a week, with a broken paw. They were actively looking for her old owners, but in vain ... Someone even saw a dog thrown out of the car near the gas station. But the fact that the old owners were not found, the fracture is extremely difficult, and the time she spent at the gas station, without treatment, did not help. A complex operation on osteosynthesis was performed, now Chibi is fine, but lameness will remain, which makes it difficult to adjust ... Although we do not understand why lameness repulses potential owners ...

Chi is a chic long-haired German shepherd. A kind, gentle, gentle, loving girl. Chi is extremely sociable and very human-oriented!) Smart, obedient shepherd. Chiba just adores people, so she desperately needs her man. At the moment she is in a vet clinic, she has little communication, she is sad ... But after she will have to go to the shelter ... But the girl is home and deserves to find her happiness. We hope that Chibu will be noticed.
Lameness does not prevent her from being herself! Chi is a moderately active dog. But very playful, like a puppy) Chatty, like all shepherds, skachkarki and very cute) Loves walks, interesting and business girl, she is interested in everything and needs everything) Knows walking. Will be able to live in an apartment.
        """
            ),
            DogInfo(
                name = "Ziva",
                image = R.drawable.ic_ziva,
                description = """
Looking for a happy family.
A half-breed of hound and local handsome man, vaccinated, cheerful, well-educated, company for lovers of walks. Taken in the fall with my mother, no one in the village appreciates the girls, and they are gentle, loving, faithful. Best friends and defenders.
        """
            ),
            DogInfo(
                name = "Ryzhik",
                image = R.drawable.ic_ryzhik,
                description = """
🧡💛🧡Kyiv / suburbs🧡💛🧡
Do you dream of a best friend? 🐾🐕🐾Best and friend is about our Ryzhik 🧡
A dog is a dream! The most the most! The kindest, the kindest, the most obedient! You fall in love with him at first sight😍
✅ Adores children and gets along perfectly with other dogs.
✅Knows walking, walks well on a leash. Can live in a private house or apartment.
Ryzhik is already familiar with the cruelty of street life and people😭That is why we are looking for a responsible good family and a warm home🐕🏡👨‍👩‍👧‍👧💖
🧡Age: 1 year
💛Health: healthy, treated for parasites, vaccinated, castrated.
In Kiev and the region I will bring personally under the contract on responsible maintenance.
        """
            ),
        ).map { it.id to it }.toMap()
    }
}