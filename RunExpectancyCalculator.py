# Variables for runner location and number of outs
empty = .645
emptyOneOut = .330
emptyTwoOut = .122
oneOnFirstNoOut = 1.086
oneOnFirstOneOut = .607
oneOnFirstTwoOut = .251
oneOnSecondNoOut = 1.373
oneOnSecondOneOut = .801
oneOnSecondTwoOut = .361
oneOnThirdNoOut = 1.730
oneOnThirdOneOut = 1.083
oneOnThirdTwoOut = .433
firstAndSecondNoOut = 1.790
firstAndSecondOneOut = 1.068
firstAndSecondTwoOut = .489
firstAndThirdNoOut = 2.090
firstAndThirdOneOut = 1.338
firstAndThirdTwoOut = .573
secondAndThirdNoOut = 2.347
secondAndThirdOneOut = 1.508
secondAndThirdTwoOut = .654
basesLoadedNoOut = 2.769
basesLoadedOneOut = 1.813
basesLoadedTwoOut = .841

def getNum(runnerLocation, outs):
    if (runnerLocation == 0 and outs == 0):
        return empty
    elif(runnerLocation == 0 and outs == 1):
        return emptyOneOut
    elif (runnerLocation == 0 and outs == 2):
        return emptyTwoOut
    elif (runnerLocation == 1 and outs == 0):
        return oneOnFirstNoOut
    elif (runnerLocation == 1 and outs == 1):
        return oneOnFirstOneOut
    elif (runnerLocation == 1 and outs == 2):
        return oneOnFirstTwoOut
    elif (runnerLocation == 2 and outs == 0):
        return oneOnSecondNoOut
    elif (runnerLocation == 2 and outs == 1):
        return oneOnSecondOneOut
    elif (runnerLocation == 2 and outs == 2):
        return oneOnSecondTwoOut
    elif (runnerLocation == 3 and outs == 0):
        return oneOnThirdNoOut
    elif (runnerLocation == 3 and outs == 1):
        return oneOnThirdOneOut
    elif (runnerLocation == 3 and outs == 2):
        return oneOnThirdTwoOut
    elif (runnerLocation == 12 and outs == 0):
        return firstAndSecondNoOut
    elif (runnerLocation == 12 and outs == 1):
        return firstAndSecondOneOut
    elif (runnerLocation == 12 and outs == 2):
        return firstAndSecondTwoOut
    elif (runnerLocation == 13 and outs == 0):
        return firstAndThirdNoOut
    elif (runnerLocation == 13 and outs == 1):
        return firstAndThirdOneOut
    elif (runnerLocation == 13 and outs == 2):
        return firstAndThirdTwoOut
    elif (runnerLocation == 23 and outs == 0):
        return secondAndThirdNoOut
    elif (runnerLocation == 23 and outs == 1):
        return secondAndThirdOneOut
    elif (runnerLocation == 23 and outs == 2):
        return secondAndThirdTwoOut
    elif (runnerLocation == 123 and outs == 0):
        return basesLoadedNoOut
    elif (runnerLocation == 123 and outs == 1):
        return basesLoadedOneOut
    elif (runnerLocation == 123 and outs == 2):
        return basesLoadedTwoOut
    else:
        return 0


labels = ['0: Empty', '1: First Base', '2: Second Base', '3: Third Base']
print("\n\n\n\nHere are your options for runner location. You can also use a multitude of numbers: ")
print("\n" + str(labels))

stat = []

pitcherStillIn = True

while(pitcherStillIn):
    pitcher = input("\nIs the Pitcher still in? Y/N ")

    if (pitcher[0 : 1] =='y'):
        while (type(pitcher) != int):
            try:
               runnerLocation = int(input("\nWhere are the runners at? "))
               outs = int(input("How many outs are there? "))
               if (type(runnerLocation) and type(outs) == int) :
                   break
            except ValueError:
                print("Enter an Integer.")
                continue

        print(getNum(runnerLocation, outs))

        print("\nNext scenario\n")
        while (type(pitcher) != int):
            try:
                runnerLocation2 = int(input("\nWhere are the runners at? "))
                outs2 = int(input("How many outs are there? "))
                if (type(runnerLocation2) and type(outs2) == int):
                    break
            except ValueError:
                print("Enter an Integer.")
                continue

        print(getNum(runnerLocation2, outs2))

        thisStat = getNum(runnerLocation, outs) - getNum(runnerLocation2, outs2)
        stat.append(thisStat)
        # print("Here is the difference: " + str(thisStat))

    elif (pitcher[0 : 1] == 'n'):
        pitcherStillIn = False
        print("Here is the Run Expectancy: " + str(round(sum(stat), 3)))

        runsQuestion = input("Did any runs score? Y/N ")
        if (runsQuestion[0 : 1] == 'y') :
            runs = int(input("How many runs scored? "))
            print("Here's the new Run Expectancy: " + str(round(sum(stat), 3) - runs))
    else:
        print("Try another input.")