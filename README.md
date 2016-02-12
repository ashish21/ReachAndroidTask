Reach Android Task

You need to morph the @id/headerImage into the @id/topImage and return it back to the original form while the user is scrolling the @id/customScrollView up and down.
So basically the View should be translating, scaling, and it's alpha should be changing according to how much the ScrollView is being scrolled (Relative animation).