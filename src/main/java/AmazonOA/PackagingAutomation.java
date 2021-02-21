//package AmazonOA;
//
//public class PackagingAutomation {
//    int packagingAutomation(vector<int> cpA){
//
//        if (cpA.size() == 1){
//            return 1;
//        }
//
//        map<int,int> m;
//
//        for (auto kk : cpA){
//            m[kk]++;
//        }
//
//        unsigned int i = 0;
//        int maxRes = 1;
//        int borrowed = 0;
//        vector<int> res;
//
//
//        while (i < cpA.size()){
//
//            if (m[maxRes] != 0){
//                int payBack = m[maxRes] - borrowed;
//
//                if (payBack == 0){
//                    res.push_back(maxRes);
//                    i++;
//                    borrowed++;
//                }
//
//                else if (payBack > 0){
//                    for (int i = 0; i < payBack; i++){
//                        res.push_back(maxRes);
//                    }
//                    i += payBack;
//                }
//
//                else{
//                    return cpA.size();
//                }
//
//                borrowed -= m[maxRes];
//                if (borrowed < 0){
//                    borrowed = 0;
//                }
//
//            }
//
//            else{
//                res.push_back(maxRes);
//                i++;
//                borrowed++;
//            }
//            maxRes++;
//        }
//
//
//        return res[cpA.size()-1];
//
//}
