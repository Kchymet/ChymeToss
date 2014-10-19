ChymeToss
=========

Boilermake Fall 2014 Project
Dice-rolling parser

        Version: 0.0.1 BoilerMake Prototype\n
        Open Source Forever\n
        Github: https://github.com/Kchymet/ChymeToss\n
        Features:\n
        -k constant number
        -ndk standard dice roll syntax\n
        -nd{k1,k2,k3,k4,k5} style dice rolls: select n from the set, returns a set\n
        -ndk+ndk+k addition of integer results\n
        -nd{k1,k2}+nd{k1,k2} concatenation of set results\n
        -ndk+nd{k1,k2,k3}+k concatenation into set result\n
        -string or integer values in sets
        Upcoming Features:\n
        -save/cache dice strings
        -predefined dice strings
        -set selection no repeats
        -rerolling certain results (ndkrj)\n
        -drop low/high and keep low/high\n
        -exploding dice\n
        -interface and error improvements
        Semantics:\n
        -Addition is right-associative\n
        -ndk+1d{k1,k2}+k3+k4 = ndk+(1d{k1,k2}+(k3+k4))
