


def main(players):
    captain_1 = 0
    captain_2 = 0

    index = 1
    while len(players) > 0:
        if index % 2 == 0:
            captain_2 += int(max(players))
            players.remove(max(players))
        else:
            captain_1 += int(max(players))
            players.remove(max(players))
        index += 1
    # print(captain_1, captain_2)
    print(abs(captain_1 - captain_2))


# ------- RUNNING CODE -------
import sys
arr_ = []
for line in sys.stdin:
    if len(line) == 1:
        break
    main(line.split())
