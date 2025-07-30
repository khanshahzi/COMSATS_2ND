package pkgfinal.project;
public class FinalProject {
    public static void main(String[]args){
        char[][]ans={{'D','E','B','C','C','D','A','E','A','D',},
            {'B','E','B','B','A','C','A','E','A','D',},
            {'A','E','D','D','D','D','A','E','A','D',},
            {'B','B','A','A','C','D','A','E','A','D',},
            {'B','C','D','D','D','A','A','E','A','D',},
            {'B','B','C','C','E','B','A','E','A','D',},
            {'C','C','B','E','B','C','A','E','A','D',},
            {'E','E','D','D','D','D','A','E','A','D',},
            {'A','D','D','B','A','E','A','E','A','D',},
            {'D','D','D','A','D','A','A','E','A','D'}};
                
    char[]key={'D','B','D','C','C','D','A','E','A','D'};
    for(int i=0;i<ans.length;i++)
    { 
        int correctcount=0;
        for(int j=0;j<ans[i].length;j++){
            if(ans[i][j]==key[j])
                correctcount++;
        }
        System.out.println("student"+i+"'s correct count is"+correctcount);
    }
}
}