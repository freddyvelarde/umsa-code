nums = {
    "1": "a1",
    "2": "b1",
    "3": 'c1',
    "4": 'd1',
    "5": 'e1',
    "6": 'f1',
    "7": 'g1',
    "8": 'h1',
    "9": 'a2',
   "10": 'b2',
   "11": 'c2',
   "12": 'd2',
   "13": 'e2',
   "14": 'f2',
   "15": 'g2',
   "16": 'h2',
   "17": 'a3',
   "18": 'b3',
   "19": 'c3',
   "20": 'd3',
   "21": 'e3',
   "22": 'f3',
   "23": 'g3',
   "24": 'h3',
   "25": 'a4',
   "26": 'b4',
   "27": 'c4',
   "28": 'd4',
   "29": 'e4',
   "30": 'f4',
   "31": 'g4',
   "32": 'h4',
   "33": 'a5',
   "34": 'b5',
   "35": 'c5',
   "36": 'd5',
   "37": 'e5',
   "38": 'f5',
   "39": 'g5',
   "40": 'h5',
   "41": 'a6',
   "42": 'b6',
   "43": 'c6',
   "44": 'd6',
   "45": 'e6',
   "46": 'f6',
   "47": 'g6',
   "48": 'h6',
   "49": 'a7',
   "50": 'b7',
   "51": 'c7',
   "52": 'd7',
   "53": 'e7',
   "54": 'f7',
   "55": 'g7',
   "56": 'h7',
   "57": 'a8',
   "58": 'b8',
   "59": 'c8',
   "60": 'd8',
   "61": 'e8',
   "62": 'f8',
   "63": 'g8',
   "64": 'h8',
}
chess = dict((v, k) for k, v in nums.items())


# RUNNING CODE
n = int(input())
for x in range(n):
    num = input()
    if num not in nums:
        print(chess[num])
    else:
        print(nums[num])