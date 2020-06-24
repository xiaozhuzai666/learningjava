public class VigenereSimple
    {
                 public StringBuilder keyWord;
            public char[] plaintext;
                public char[] key;
                public char[][] Vtable;
                private String p="abcdefghijklmnopqrstuvwxyz";
                public StringBuilder result;
              public String[] v=
             {
                     "ABCDEFGHIJKLMNOPQRSTUVWXYZ","BCDEFGHIJKLMNOPQRSTUVWXYZA",
                     "CDEFGHIJKLMNOPQRSTUVWXYZAB","DEFGHIJKLMNOPQRSTUVWXYZABC",
                     "EFGHIJKLMNOPQRSTUVWXYZABCD","FGHIJKLMNOPQRSTUVWXYZABCDE",
                     "GHIJKLMNOPQRSTUVWXYZABCDEF","HIJKLMNOPQRSTUVWXYZABCDEFG",
                     "IJKLMNOPQRSTUVWXYZABCDEFGH","JKLMNOPQRSTUVWXYZABCDEFGHI",
                     "KLMNOPQRSTUVWXYZABCDEFGHIJ","LMNOPQRSTUVWXYZABCDEFGHIJK", 
                     "MNOPQRSTUVWXYZABCDEFGHIJKL","NOPQRSTUVWXYZABCDEFGHIJKLM", 
                     "OPQRSTUVWXYZABCDEFGHIJKLMN","PQRSTUVWXYZABCDEFGHIJKLMNO", 
                     "QRSTUVWXYZABCDEFGHIJKLMNOP","RSTUVWXYZABCDEFGHIJKLMNOPQ", 
                     "STUVWXYZABCDEFGHIJKLMNOPQR","TUVWXYZABCDEFGHIJKLMNOPQRS", 
                     "UVWXYZABCDEFGHIJKLMNOPQRST","VWXYZABCDEFGHIJKLMNOPQRSTU", 
                     "WXYZABCDEFGHIJKLMNOPQRSTUV","XYZABCDEFGHIJKLMNOPQRSTUVW", 
                     "YZABCDEFGHIJKLMNOPQRSTUVWX","ZABCDEFGHIJKLMNOPQRSTUVWXY"};
        
              public VigenereSimple() {
                  keyWord = new StringBuilder();
                  plaintext = new char[100];
                  key = new char[100];
                  Vtable = new char[26][];
                  result = new StringBuilder();
                  for (int i = 0; i < v.length; i++) {
                      Vtable[i] = v[i].toCharArray();

                      //
                      // TODO: 在此处添加构造函数逻辑
                      //
                  }

                  private void GetKey()
                  {
                      int Pnum, KWnum, n, ne;
                      String k, k1, k2;
                      k2 = keyWord.toString();
                      Pnum = plaintext.length;
                      KWnum = keyWord.length();
                      if (Pnum > KWnum) {
                          n = Pnum / KWnum;
                          ne = Pnum % KWnum;
                          for (int i = 1; i < n; i++)
                              keyWord.append(k2);
                          k = keyWord.toString().substring(0, ne);
                          keyWord.append(k);
                          k1 = keyWord.toString();
                          key = keyWord.toString().toCharArray();
                      } else {
                          key = keyWord.toString().substring(0, Pnum).toCharArray();
                      }

                  }

                  public void EncryptData(String str; String str2)//str为加密的明文，str2为密钥
                  {
                      int x, y;
                      keyWord.ppend(str2);
                      plaintext = str.ToCharArray();
                      GetKey();
                      for (int i = 0; i < key.Length; i++) {
                          x = p.IndexOf(plaintext[i].ToString());
                          y = p.IndexOf(key[i].ToString());
                          result.Append(Vtable[x][y].ToString());
                      }
                      string fileName = "c:\\Encryptdate.txt";
                      if (File.Exists(fileName)) {
                          File.Delete(fileName);
                      }
                      FileStream fs = File.Create(fileName);

                      StreamWriter sw = new StreamWriter(fs, System.Text.Encoding.Unicode);
                      sw.Write(result);
                      sw.Flush();
                      fs.Close();
                      keyWord.Remove(0, keyWord.Length);
                      result.Remove(0, result.Length);

                  }

                  public void GetPlainWord (string str, string str2)//str为解密的密文,str2为密钥
                  {
                      int x, y;
                      keyWord.Append(str2);
                      plaintext = str.ToCharArray();
                      GetKey();
                      for (int i = 0; i < key.Length; i++) {
                          y = p.IndexOf(key[i].ToString());
                          x = v[y].IndexOf(plaintext[i].ToString());
                          result.Append(p[x].ToString());
                      }

                      string fileName = "c:\\plaintext.txt";
                      if (File.Exists(fileName)) {
                          File.Delete(fileName);
                      }
                      FileStream fs = File.Create(fileName);
                      StreamWriter sw = new StreamWriter(fs, System.Text.Encoding.Unicode);
                      4 sw.Write(result);
                      sw.Flush();
                      fs.Close();
                      keyWord.Remove(0, keyWord.Length);
                      result.Remove(0, result.Length);
                  }

              }

        private void GetKey() {
        }
    }
              