module Lib
    ( someFunc,
      factorial1,
      factorial2
    ) where

someFunc :: IO ()
someFunc = putStrLn "someFunc"

factorial1 :: Integer -> Integer
factorial1 0 = 1
factorial1 n = n * (factorial1 (n-1))


factorial2 :: Integer -> Integer
factorial2 n  = case n of
  0 -> 1
  _ -> n* (factorial2 (n-1))

ibinOp :: (Integer -> Integer -> Integer) -> Integer -> Integer -> Integer
ibinOp op a b = op a b

isum = ibinOp (+)
imul = ibinOp (*)
inc = ibinOp (+) 1
double = imul 2